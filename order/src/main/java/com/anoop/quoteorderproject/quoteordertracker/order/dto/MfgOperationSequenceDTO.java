package com.anoop.quoteorderproject.quoteordertracker.order.dto;

public class MfgOperationSequenceDTO {
    private Integer operSeqId;
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
