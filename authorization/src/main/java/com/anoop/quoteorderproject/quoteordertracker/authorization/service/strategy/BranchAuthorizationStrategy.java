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
public class BranchAuthorizationStrategy implements AuthorizationStrategy {

    @Autowired private BranchService branchService;
    @Autowired private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO emp) {
        return "BRANCH".equalsIgnoreCase(emp.getTreeBranchType()) &&
               emp.getGeneralLedgerExpense().length() == 7;
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO emp) {
        String branchCode = emp.getGeneralLedgerExpense();
        BranchDTO branch = branchService.getBranchByCode(branchCode);
        List<String> permissions = rolePermissionService.getPermissionsByAdUserId(emp.getEmail());

        return new AuthorizationResponse(
            emp.getId(),
            "BRANCH",
            List.of(branch.getBranchCode()),
            permissions
        );
    }
}