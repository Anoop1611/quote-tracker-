
package com.anoop.quoteorderproject.quoteordertracker.order.entity;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "mfg_order")
public class MfgOrder {

    @Id
    @Column(name = "production_id", length = 100)
    private String productionId;

    @Column(name = "mfg_pillar", length = 100)
    private String mfgPillar;

    @Column(name = "branch", length = 100)
    private String branch;

    @Column(name = "production_status", length = 100)
    private String productionStatus;

    @Column(name = "branch_quote_no", length = 100)
    private String branchQuoteNo;

    @Column(name = "branch_contact", length = 100)
    private String branchContact;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "mfg_part_no", length = 100)
    private String mfgPartNo;

    @Column(name = "mfg_part_desc", length = 255)
    private String mfgPartDesc;

    @Column(name = "order_qty")
    private int orderQty;

    @Column(name = "branch_cost")
    private float branchCost;

    @Column(name = "mfg_quoter", length = 100)
    private String mfgQuoter;

    @Column(name = "customer_account_no", length = 100)
    private String customerAccountNo;

    @Column(name = "customer_name", length = 255)
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

    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
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