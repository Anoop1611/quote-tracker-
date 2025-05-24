package com.anoop.quoteorderproject.quoteordertracker.order.dto;

import java.time.LocalDate;

public class MfgOrderShipmentDTO {
    private String productionId;
    private LocalDate shipDate;
    private String shipTypeCode;
    private String shippingStatusCode;
    private Integer qtyShipped;
    private String uom;
    private String lpn;
    private String licenseStatusCode;
    private String packagingCode;

    // ✅ Constructors
    public MfgOrderShipmentDTO() {}

    public MfgOrderShipmentDTO(String productionId, LocalDate shipDate, String shipTypeCode, String shippingStatusCode,
                               Integer qtyShipped, String uom, String lpn, String licenseStatusCode, String packagingCode) {
        this.productionId = productionId;
        this.shipDate = shipDate;
        this.shipTypeCode = shipTypeCode;
        this.shippingStatusCode = shippingStatusCode;
        this.qtyShipped = qtyShipped;
        this.uom = uom;
        this.lpn = lpn;
        this.licenseStatusCode = licenseStatusCode;
        this.packagingCode = packagingCode;
    }

    // ✅ Getters & Setters
    public String getProductionId() {
        return productionId;
    }

    public void setProductionId(String productionId) {
        this.productionId = productionId;
    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    public void setShipDate(LocalDate shipDate) {
        this.shipDate = shipDate;
    }

    public String getShipTypeCode() {
        return shipTypeCode;
    }

    public void setShipTypeCode(String shipTypeCode) {
        this.shipTypeCode = shipTypeCode;
    }

    public String getShippingStatusCode() {
        return shippingStatusCode;
    }

    public void setShippingStatusCode(String shippingStatusCode) {
        this.shippingStatusCode = shippingStatusCode;
    }

    public Integer getQtyShipped() {
        return qtyShipped;
    }

    public void setQtyShipped(Integer qtyShipped) {
        this.qtyShipped = qtyShipped;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public String getLicenseStatusCode() {
        return licenseStatusCode;
    }

    public void setLicenseStatusCode(String licenseStatusCode) {
        this.licenseStatusCode = licenseStatusCode;
    }

    public String getPackagingCode() {
        return packagingCode;
    }

    public void setPackagingCode(String packagingCode) {
        this.packagingCode = packagingCode;
    }
}

