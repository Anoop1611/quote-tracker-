package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;

importcom.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.BranchService;
@Component
public class DefaultFastenalUserAuthorizationStrategy implements AuthorizationStrategy {

    @Autowired private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO emp) {
        return true; // fallback for any unmatched logic
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO emp) {
        List<String> permissions = rolePermissionService.getPermissionsByAdUserId("fnl_emp_user@fastenal.com");

        return new AuthorizationResponse(
            emp.getId(),
            "FASTENAL_USER",
            Collections.emptyList(),
            permissions
        );
    }
}
