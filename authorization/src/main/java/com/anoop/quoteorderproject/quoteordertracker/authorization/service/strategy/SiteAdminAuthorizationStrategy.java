package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;

import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collections;
import java.util.List;
import java.util.Set;
@Component
public class SiteAdminAuthorizationStrategy implements AuthorizationStrategy {

    private static final Set<String> ADMIN_AD_GROUPS = Set.of(
        "ispsanalystsmfg@fastenal.com",
        "ManufacturingPublishedApps@fastenal.com"
    );

    @Autowired private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO employee) {
        return ADMIN_AD_GROUPS.contains(employee.getEmployeeEmail().toLowerCase());
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO employee) {
        List<String> permissions = rolePermissionService.getRolePermissions("mfg_site_admin");

        return new AuthorizationResponse(
            employee.getEmployeeId(),
            "SITE_ADMIN",
            Collections.emptyList(),  // all branches implicitly allowed
            permissions
        );
    }
}