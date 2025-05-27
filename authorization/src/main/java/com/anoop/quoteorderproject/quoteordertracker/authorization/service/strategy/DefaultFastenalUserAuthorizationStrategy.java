package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;

import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collections;
import java.util.List;


@Component
public class DefaultFastenalUserAuthorizationStrategy implements AuthorizationStrategy {

    @Autowired
    private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO emp) {
        // Always returns true as a fallback/default strategy
        return true;
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO emp) {
        String role = "fnl_emp";  // fallback role
        List<String> permissions = rolePermissionService.getRolePermissions(role);

        return new AuthorizationResponse(
            emp.getEmployeeId(),
            role,
            Collections.emptyList(), // No accessible branches for generic users
            permissions
        );
    }
}

