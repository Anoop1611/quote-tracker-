package com.anoop.quoteorderproject.quoteordertracker.order.dto;

import java.time.LocalDate;

public class MfgOrderProductionDetailDTO {
    private String productionId;
    private Integer operSeqId;
    private String taskType;
    private String taskDesc;
    private Integer productionQty;
    private Integer finishedQty;
    private LocalDate scheduledStartDate;
    private LocalDate scheduledEndDate;

    // ✅ Constructors
    public MfgOrderProductionDetailDTO() {}

    public MfgOrderProductionDetailDTO(String productionId, Integer operSeqId, String taskType, String taskDesc,
                                       Integer productionQty, Integer finishedQty, LocalDate scheduledStartDate,
                                       LocalDate scheduledEndDate) {
        this.productionId = productionId;
        this.operSeqId = operSeqId;
        this.taskType = taskType;
        this.taskDesc = taskDesc;
        this.productionQty = productionQty;
        this.finishedQty = finishedQty;
        this.scheduledStartDate = scheduledStartDate;
        this.scheduledEndDate = scheduledEndDate;
    }

    // ✅ Getters & Setters
    public String getProductionId() {
        return productionId;
    }

    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }

    public Integer getOperSeqId() {
        return operSeqId;
    }

    public void setOperSeqId(Integer operSeqId) {
        this.operSeqId = operSeqId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public Integer getProductionQty() {
        return productionQty;
    }

    public void setProductionQty(Integer productionQty) {
        this.productionQty = productionQty;
    }

    public Integer getFinishedQty() {
        return finishedQty;
    }

    public void setFinishedQty(Integer finishedQty) {
        this.finishedQty = finishedQty;
    }

    public LocalDate getScheduledStartDate() {
        return scheduledStartDate;
    }

    public void setScheduledStartDate(LocalDate scheduledStartDate) {
        this.scheduledStartDate = scheduledStartDate;
    }

    public LocalDate getScheduledEndDate() {
        return scheduledEndDate;
    }

    public void setScheduledEndDate(LocalDate scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }
}
