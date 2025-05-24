package com.anoop.quoteorderproject.quoteordertracker.order.dto;

public class MfgOrderDTO {
    private String productionId;
    private String mfgPillar;
    private String branch;
    private String productionStatus;
    private String branchQuoteNo;
    private String branchContact;
    private java.sql.Date orderDate;
    private java.sql.Date dueDate;
    private String mfgPartNo;
    private String mfgPartDesc;
    private int orderQty;
    private float branchCost;
    private String mfgQuoter;
    private String customerAccountNo;
    private String customerName;

    // Getters and setters
    public String getProductionId() {
        return productionId;
    }
    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }

    public String getMfgPillar() {
        return mfgPillar;
    }
    public void setMfgPillar(String mfgPillar) {
        this.mfgPillar = mfgPillar;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getProductionStatus() {
        return productionStatus;
    }
    public void setProductionStatus(String productionStatus) {
        this.productionStatus = productionStatus;
    }

    public String getBranchQuoteNo() {
        return branchQuoteNo;
    }
    public void setBranchQuoteNo(String branchQuoteNo) {
        this.branchQuoteNo = branchQuoteNo;
    }

    public String getBranchContact() {
        return branchContact;
    }
    public void setBranchContact(String branchContact) {
        this.branchContact = branchContact;
    }

    public java.sql.Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(java.sql.Date orderDate) {
        this.orderDate = orderDate;
    }

    public java.sql.Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(java.sql.Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getMfgPartNo() {
        return mfgPartNo;
    }
    public void setMfgPartNo(String mfgPartNo) {
        this.mfgPartNo = mfgPartNo;
    }

    public String getMfgPartDesc() {
        return mfgPartDesc;
    }
    public void setMfgPartDesc(String mfgPartDesc) {
        this.mfgPartDesc = mfgPartDesc;
    }

    public int getOrderQty() {
        return orderQty;
    }
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public float getBranchCost() {
        return branchCost;
    }
    public void setBranchCost(float branchCost) {
        this.branchCost = branchCost;
    }

    public String getMfgQuoter() {
        return mfgQuoter;
    }
    public void setMfgQuoter(String mfgQuoter) {
        this.mfgQuoter = mfgQuoter;
    }

    public String getCustomerAccountNo() {
        return customerAccountNo;
    }
    public void setCustomerAccountNo(String customerAccountNo) {
        this.customerAccountNo = customerAccountNo;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
