package com.anoop.quoteorderproject.quoteordertracker.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mfg_operation_sequence")
public class MfgOperationSequence {
    @Id
    @Column(name = "oper_seq_id")
    private Integer operSeqId;
    @Column(name = "production_id")
    private String productionId; // FK to MfgOrder.productionId

    public Integer getOperSeqId() {
        return operSeqId;
    }
    public void setOperSeqId(Integer operSeqId) {
        this.operSeqId = operSeqId;
    }
    public String getProductionId() {
        return productionId;
    }
    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }
}
