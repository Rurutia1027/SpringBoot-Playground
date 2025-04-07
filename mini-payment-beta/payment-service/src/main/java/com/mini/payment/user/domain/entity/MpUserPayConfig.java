package com.mini.payment.user.domain.entity;

import com.mini.payment.domain.DomainImpl;
import com.mini.payment.user.enums.SecurityRatingEnum;
import jakarta.persistence.Entity;

@Entity
public class MpUserPayConfig extends DomainImpl {
    private String auditStatus;
    private String isAutoSett;
    private String productCode;
    private String userNo;
    private String userName;
    private Integer riskDay;
    private String payKey;
    private String fundIntoType;
    private String paySecret;
    private String securityRating = SecurityRatingEnum.MD5.name();
    private String merchantServerIp;

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getIsAutoSett() {
        return isAutoSett;
    }

    public void setIsAutoSett(String isAutoSett) {
        this.isAutoSett = isAutoSett;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getRiskDay() {
        return riskDay;
    }

    public void setRiskDay(Integer riskDay) {
        this.riskDay = riskDay;
    }

    public String getPayKey() {
        return payKey;
    }

    public void setPayKey(String payKey) {
        this.payKey = payKey;
    }

    public String getFundIntoType() {
        return fundIntoType;
    }

    public void setFundIntoType(String fundIntoType) {
        this.fundIntoType = fundIntoType;
    }

    public String getPaySecret() {
        return paySecret;
    }

    public void setPaySecret(String paySecret) {
        this.paySecret = paySecret;
    }

    public String getSecurityRating() {
        return securityRating;
    }

    public void setSecurityRating(String securityRating) {
        this.securityRating = securityRating;
    }

    public String getMerchantServerIp() {
        return merchantServerIp;
    }

    public void setMerchantServerIp(String merchantServerIp) {
        this.merchantServerIp = merchantServerIp;
    }
}
