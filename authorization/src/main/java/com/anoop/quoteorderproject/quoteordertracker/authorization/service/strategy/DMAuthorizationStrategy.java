package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;

import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collections;
import java.util.List;
import java.util.Set;
public class DMAuthorizationStrategy implements AuthorizationStrategy {

    @Autowired private BranchService branchService;
    @Autowired private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO emp) {
        return "BRANCH".equalsIgnoreCase(emp.getTreeBranchType()) &&
               "000054".equals(emp.getJobCode());
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO emp) {
        String districtCode = emp.getGeneralLedgerExpense();
        List<BranchDTO> branches = branchService.getBranchesByDistrict(districtCode);
        List<String> branchCodes = branches.stream()
                                           .map(BranchDTO::getBranchCode)
                                           .toList();
        List<String> permissions = rolePermissionService.getPermissionsByAdUserId(emp.getEmail());

        return new AuthorizationResponse(
            emp.getEmployeeId(),
            "DM",
            branchCodes,
            permissions
        );
    }
}