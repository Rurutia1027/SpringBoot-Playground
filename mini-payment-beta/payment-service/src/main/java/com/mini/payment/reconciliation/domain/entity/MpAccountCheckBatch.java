package com.mini.payment.reconciliation.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class MpAccountCheckBatch extends DomainImpl {
    private String batchNo;
    private Date billDate;
    private String billType;
    private String handleStatus;
    private String bankType;
    private Integer mistakeCount;
    private Integer unHandleMistakeCount;
    private Integer tradeCount;
    private Integer bankTradeCount;
    private BigDecimal tradeAmount;
    private BigDecimal bankTradeAmount;
    private BigDecimal refundAmount;
    private BigDecimal bankRefundAmount;
    private BigDecimal fee;
    private BigDecimal bankFee;
    private String orgCheckFilePath;
    private String releaseCheckFilePath;
    private String releaseStatus;
    private String checkFailMsg;
    private String bankErrMsg;


    // -- setter && getter --

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public Integer getMistakeCount() {
        return mistakeCount;
    }

    public void setMistakeCount(Integer mistakeCount) {
        this.mistakeCount = mistakeCount;
    }

    public Integer getUnHandleMistakeCount() {
        return unHandleMistakeCount;
    }

    public void setUnHandleMistakeCount(Integer unHandleMistakeCount) {
        this.unHandleMistakeCount = unHandleMistakeCount;
    }

    public Integer getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Integer getBankTradeCount() {
        return bankTradeCount;
    }

    public void setBankTradeCount(Integer bankTradeCount) {
        this.bankTradeCount = bankTradeCount;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public BigDecimal getBankTradeAmount() {
        return bankTradeAmount;
    }

    public void setBankTradeAmount(BigDecimal bankTradeAmount) {
        this.bankTradeAmount = bankTradeAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getBankRefundAmount() {
        return bankRefundAmount;
    }

    public void setBankRefundAmount(BigDecimal bankRefundAmount) {
        this.bankRefundAmount = bankRefundAmount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getBankFee() {
        return bankFee;
    }

    public void setBankFee(BigDecimal bankFee) {
        this.bankFee = bankFee;
    }

    public String getOrgCheckFilePath() {
        return orgCheckFilePath;
    }

    public void setOrgCheckFilePath(String orgCheckFilePath) {
        this.orgCheckFilePath = orgCheckFilePath;
    }

    public String getReleaseCheckFilePath() {
        return releaseCheckFilePath;
    }

    public void setReleaseCheckFilePath(String releaseCheckFilePath) {
        this.releaseCheckFilePath = releaseCheckFilePath;
    }

    public String getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public String getCheckFailMsg() {
        return checkFailMsg;
    }

    public void setCheckFailMsg(String checkFailMsg) {
        this.checkFailMsg = checkFailMsg;
    }

    public String getBankErrMsg() {
        return bankErrMsg;
    }

    public void setBankErrMsg(String bankErrMsg) {
        this.bankErrMsg = bankErrMsg;
    }
}
