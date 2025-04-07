package com.mini.payment.user.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;

@Entity
public class MpPayProduct extends DomainImpl {
    private String productCode;
    private String productName;
    private String auditStatus;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }
}
