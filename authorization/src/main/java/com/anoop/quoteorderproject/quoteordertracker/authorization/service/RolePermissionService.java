package com.anoop.quoteorderproject.quoteordertracker.authorization.service;
package com.anoop.quoteorderproject.quoteordertracker.authorization.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RolePermissionService {

    private static final Map<String, List<String>> rolePermissionsMap = new HashMap<>();

    static {
        rolePermissionsMap.put("mfg_site_admin", List.of("VIEW_ALL", "EDIT_ALL", "MANAGE_USERS"));
        rolePermissionsMap.put("mfg_site_user", List.of("VIEW_ASSIGNED", "SUBMIT_RFQ"));
        rolePermissionsMap.put("dm", List.of("VIEW_DISTRICT"));
        rolePermissionsMap.put("rvp", List.of("VIEW_REGION"));
        rolePermissionsMap.put("branch_support", List.of("VIEW_BRANCH_SUPPORT"));
        rolePermissionsMap.put("fnl_emp", List.of("VIEW_BASIC"));
    }

    public List<String> getRolePermissions(String role) {
        return rolePermissionsMap.getOrDefault(role, Collections.singletonList("NO_ACCESS"));
    }
}
