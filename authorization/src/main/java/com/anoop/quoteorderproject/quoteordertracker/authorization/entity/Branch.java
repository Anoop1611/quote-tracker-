package com.anoop.quoteorderproject.quoteordertracker.authorization.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @Column(name = "branch_code", length = 20)
    private String branchCode;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "tree_branch_type", length = 50)
    private String treeBranchType;  // BRANCH or BRNCH_SUPP

    @Column(name = "general_ledger_expense", length = 20)
    private String generalLedgerExpense;  // Typically same as branch_code

    @Column(name = "district_code", length = 20)
    private String districtCode;  // Used for DM lookups

    @Column(name = "region_code", length = 20)
    private String regionCode;

    // ✅ Getters and Setters
    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTreeBranchType() { return treeBranchType; }
    public void setTreeBranchType(String treeBranchType) { this.treeBranchType = treeBranchType; }

    public String getGeneralLedgerExpense() { return generalLedgerExpense; }
    public void setGeneralLedgerExpense(String generalLedgerExpense) { this.generalLedgerExpense = generalLedgerExpense; }

    public String getDistrictCode() { return districtCode; }
    public void setDistrictCode(String districtCode) { this.districtCode = districtCode; }

    public String getRegionCode() { return regionCode; }
    public void setRegionCode(String regionCode) { this.regionCode = regionCode; }
}