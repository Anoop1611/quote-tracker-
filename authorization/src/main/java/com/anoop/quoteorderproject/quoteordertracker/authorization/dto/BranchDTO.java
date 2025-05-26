package com.anoop.quoteorderproject.quoteordertracker.authorization.dto;

public class BranchDTO {

    private String branchCode;
    private String name;
    private String treeBranchType;
    private String generalLedgerExpense;
    private String districtCode;
    private String regionCode;

    // ✅ Getters and Setters
    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTreeBranchType() {
        return treeBranchType;
    }

    public void setTreeBranchType(String treeBranchType) {
        this.treeBranchType = treeBranchType;
    }

    public String getGeneralLedgerExpense() {
        return generalLedgerExpense;
    }

    public void setGeneralLedgerExpense(String generalLedgerExpense) {
        this.generalLedgerExpense = generalLedgerExpense;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}