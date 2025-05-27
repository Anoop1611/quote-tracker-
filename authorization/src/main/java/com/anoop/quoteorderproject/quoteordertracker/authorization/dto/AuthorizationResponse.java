package com.anoop.quoteorderproject.quoteordertracker.authorization.dto;
import java.util.List;
public class AuthorizationResponse {
    private String employeeId;
    private String role;
    private List<String> accessibleBranchCodes;
    private List<String> permissions;
    public AuthorizationResponse(String employeeId, String role, List<String> accessibleBranchCodes, List<String> permissions) {
        this.employeeId = employeeId;
        this.role = role;
        this.accessibleBranchCodes = accessibleBranchCodes;
        this.permissions = permissions;
    }
}
