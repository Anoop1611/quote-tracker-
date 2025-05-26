package com.anoop.quoteorderproject.quoteordertracker.authorization.dto;

public class EmployeeDTO {

    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeeRole;
    private String jobCode;
    private String generalLedgerExpense;
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

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
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