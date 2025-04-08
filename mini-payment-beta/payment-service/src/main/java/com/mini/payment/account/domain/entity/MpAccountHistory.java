package com.mini.payment.account.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
public class MpAccountHistory extends DomainImpl implements Serializable {
    /**
     * Account number
     **/
    private String accountNo;

    /**
     * Transaction amount
     **/
    private BigDecimal amount;

    /**
     * Account balance
     **/
    private BigDecimal balance;

    /**
     * Fund direction (IN or OUT)
     **/
    private String fundDirection;

    /**
     * Is settlement allowed (Y/N)
     **/
    private String isSettlementAllowed;

    /**
     * Is settlement completed (Y/N)
     **/
    private String isSettlementCompleted;

    /**
     * Request number (external business request ID)
     **/
    private String requestNo;

    /**
     * Bank transaction number
     **/
    private String bankTransactionNo;

    /**
     * Transaction type
     **/
    private String transactionType;

    /**
     * Risk holding days (settlement delay period)
     **/
    private Integer riskHoldDays;

    /**
     * User number
     **/
    private String userNo;

    /**
     * User name
     **/
    private String userName;


    // -- getter && setter --

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getFundDirection() {
        return fundDirection;
    }

    public void setFundDirection(String fundDirection) {
        this.fundDirection = fundDirection;
    }

    public String getIsSettlementAllowed() {
        return isSettlementAllowed;
    }

    public void setIsSettlementAllowed(String isSettlementAllowed) {
        this.isSettlementAllowed = isSettlementAllowed;
    }

    public String getIsSettlementCompleted() {
        return isSettlementCompleted;
    }

    public void setIsSettlementCompleted(String isSettlementCompleted) {
        this.isSettlementCompleted = isSettlementCompleted;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getBankTransactionNo() {
        return bankTransactionNo;
    }

    public void setBankTransactionNo(String bankTransactionNo) {
        this.bankTransactionNo = bankTransactionNo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getRiskHoldDays() {
        return riskHoldDays;
    }

    public void setRiskHoldDays(Integer riskHoldDays) {
        this.riskHoldDays = riskHoldDays;
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
}
