package com.anoop.quoteorderproject.quoteordertracker.authorization.service;

import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.entity.UserRole;
import com.anoop.quoteorderproject.quoteordertracker.authorization.repository.UserRoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy.AuthorizationStrategyResolver;

import java.util.Optional;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AuthorizationService {

    private final UserRoleRepository userRoleRepository;
    private final EmployeeService employeeService;
    private final AuthorizationStrategyResolver strategyResolver;
    private final RolePermissionService rolePermissionService;  // inject this service here

    public AuthorizationResponse authorizeUser(String email) {
        // Check for explicit UserRole (via AD group or email match)
        Optional<UserRole> userRoleOpt = userRoleRepository.findByAdUserIdIgnoreCase(email);

        if (userRoleOpt.isPresent()) {
            UserRole userRole = userRoleOpt.get();
            if (userRole.getRole() != null) {
                String roleName = userRole.getRole().getName();
                // Get permissions by role name
                var permissions = rolePermissionService.getRolePermissions(roleName);
                // Return response directly here
                return new AuthorizationResponse(
                    null, // employeeId unknown here, you may want to load employee if needed
                    roleName,
                    Collections.emptyList(), // No branches assigned explicitly here
                    permissions
                );
            }
        }

        // Else treat as employee-based auth (DM, RVP, Branch, Support, etc.)
        EmployeeDTO employee = employeeService.getEmployeeByEmail(email)
                .orElseThrow(() -> new RuntimeException("Employee not found for email: " + email));

        return strategyResolver.resolve(employee);
    }
}

