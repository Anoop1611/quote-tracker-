package com.anoop.quoteorderproject.quoteordertracker.order.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mfg_order_shipment")
public class MfgOrderShipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "production_id")
    private String productionId; // FK to MfgOrder.productionId

    @Column(name = "ship_date")
    private LocalDate shipDate;

    @Column(name = "ship_type_code")
    private String shipTypeCode;

    @Column(name = "shipping_status_code")
    private String shippingStatusCode;

    @Column(name = "qty_shipped")
    private Integer qtyShipped;

    private String uom;
    private String lpn;

    @Column(name = "license_status_code")
    private String licenseStatusCode;

    @Column(name = "packaging_code")
    private String packagingCode;

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