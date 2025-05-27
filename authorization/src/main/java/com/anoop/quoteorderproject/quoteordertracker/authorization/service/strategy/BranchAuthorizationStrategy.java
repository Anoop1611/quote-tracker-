package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;

import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.BranchService;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.BranchDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.RolePermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BranchAuthorizationStrategy implements AuthorizationStrategy {

    @Autowired
    private BranchService branchService;

    @Autowired
    private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO emp) {
        return "BRANCH".equalsIgnoreCase(emp.getTreeBranchType()) &&
               emp.getGeneralLedgerExpense() != null &&
               emp.getGeneralLedgerExpense().length() == 7;
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO emp) {
        String branchCode = emp.getGeneralLedgerExpense();
        BranchDTO branch = branchService.getBranchByCode(branchCode);

        if (branch == null) {
            throw new RuntimeException("Branch not found for code: " + branchCode);
        }

        String role = "branch_support"; // or "branch_user" if that's what you want to call it
        List<String> permissions = rolePermissionService.getRolePermissions(role);

        return new AuthorizationResponse(
            emp.getEmployeeId(),
            role,
            List.of(branch.getBranchCode()),
            permissions
        );
    }
}
