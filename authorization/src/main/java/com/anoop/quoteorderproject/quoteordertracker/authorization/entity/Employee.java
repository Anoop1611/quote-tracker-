package com.anoop.quoteorderproject.quoteordertracker.authorization.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @Column(name = "employee_id")
    private String employeeId;
    @Column(name = "name")
    private String employeeName;
    @Column(name = "email")
    private String employeeEmail;
    @Column(name = "job_code")
    private String jobCode;
    @Column(name = "general_ledger_expense")
    private String generalLedgerExpense;
    @Column(name = "tree_branch_type")
    private String treeBranchType;

    // ✅ Getters and Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getGeneralLedgerExpense() {
        return generalLedgerExpense;
    }

    public void setGeneralLedgerExpense(String generalLedgerExpense) {
        this.generalLedgerExpense = generalLedgerExpense;
    }

    public String getTreeBranchType() {
        return treeBranchType;
    }

    public void setTreeBranchType(String treeBranchType) {
        this.treeBranchType = treeBranchType;
    }
}

