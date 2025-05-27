package com.anoop.quoteorderproject.quoteordertracker.authorization.service.strategy;

import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.AuthorizationResponse;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.EmployeeDTO;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import com.anoop.quoteorderproject.quoteordertracker.authorization.service.BranchService;
import com.anoop.quoteorderproject.quoteordertracker.authorization.dto.BranchDTO;


@Component
public class DMAuthorizationStrategy implements AuthorizationStrategy {

    @Autowired
    private BranchService branchService;

    @Autowired
    private RolePermissionService rolePermissionService;

    @Override
    public boolean isApplicable(EmployeeDTO emp) {
        return "BRANCH".equalsIgnoreCase(emp.getTreeBranchType()) &&
               "000054".equals(emp.getJobCode()); // District Manager
    }

    @Override
    public AuthorizationResponse authorize(EmployeeDTO emp) {
        String districtCode = emp.getGeneralLedgerExpense(); // used as district code
        List<BranchDTO> branches = branchService.getBranchesByDistrict(districtCode);
        List<String> branchCodes = branches.stream()
                                           .map(BranchDTO::getBranchCode)
                                           .toList();

        List<String> permissions = rolePermissionService.getRolePermissions("dm");

        return new AuthorizationResponse(
            emp.getEmployeeId(),
            "dm",
            branchCodes,
            permissions
        );
    }
}
