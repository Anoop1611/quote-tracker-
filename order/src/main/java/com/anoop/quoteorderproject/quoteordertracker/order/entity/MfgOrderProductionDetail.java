package com.anoop.quoteorderproject.quoteordertracker.order.entity;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mfg_order_production_detail")
public class MfgOrderProductionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_id")
    private String productionId; // FK to MfgOrder.productionId

    @Column(name = "oper_seq_id")
    private Integer operSeqId; // FK to MfgOperationSequence.operSeqId

    @Column(name = "task_type")
    private String taskType;

    @Column(name = "task_desc")
    private String taskDesc;

    @Column(name = "production_qty")
    private Integer productionQty;

    @Column(name = "finished_qty")
    private Integer finishedQty;

    @Column(name = "scheduled_start_date")
    private LocalDate scheduledStartDate;

    @Column(name = "scheduled_end_date")
    private LocalDate scheduledEndDate;

    // ✅ Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

