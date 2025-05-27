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
    public String getEmployeeId() {
        return employeeId;
    } 
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }  
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    } 
    public List<String> getAccessibleBranchCodes() {
        return accessibleBranchCodes;
    }
    public void setAccessibleBranchCodes(List<String> accessibleBranchCodes) {
        this.accessibleBranchCodes = accessibleBranchCodes;
    }
    public List<String> getPermissions() {
        return permissions;
    }
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
    
}
