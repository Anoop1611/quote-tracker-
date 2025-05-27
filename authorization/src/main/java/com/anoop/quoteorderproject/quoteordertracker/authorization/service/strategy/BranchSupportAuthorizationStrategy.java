package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;

import  com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.BranchDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.BranchService;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Component;
@Component
public class BranchSupportAuthorizationStrategy implements AuthorizationStrategy {

    private static final Set<String> SUPPORTED_JOB_CODES = Set.of(
        "001508", "000450", "000359", "000281", "000284",
        "000285", "000704", "001168"
    );

    @Autowired private BranchService branchService;
    @Autowired private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO emp) {
        return "BRNCH_SUPP".equalsIgnoreCase(emp.getTreeBranchType()) &&
               SUPPORTED_JOB_CODES.contains(emp.getJobCode());
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO emp) {
        String regionCode = emp.getGeneralLedgerExpense();
        List<BranchDTO> branches = branchService.getBranchesByRegion(regionCode);
        List<String> branchCodes = branches.stream()
                                           .map(BranchDTO::getBranchCode)
                                           .toList();
        List<String> permissions = rolePermissionService.getPermissionsByAdUserId(emp.getEmail());

        return new AuthorizationResponse(
            emp.getId(),
            "BRANCH_SUPPORT",
            branchCodes,
            permissions
        );
    }
}
