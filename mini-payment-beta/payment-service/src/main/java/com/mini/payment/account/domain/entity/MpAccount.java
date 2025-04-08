package com.mini.payment.account.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class MpAccount extends DomainImpl implements Serializable {
    private static final long serialVersionUID = 2345432L;
    /**
     * Account number
     **/
    private String accountNo;

    /**
     * Account balance
     **/
    private BigDecimal balance;


    /**
     * Unavailable balance
     **/
    private BigDecimal unavailableBalance;

    /**
     * Security deposit (guarantee money)
     **/
    private BigDecimal securityDeposit;

    /**
     * Total income
     **/
    private BigDecimal totalIncome;

    /**
     * Total expenditure
     **/
    private BigDecimal totalExpenditure;

    /**
     * Income of today
     **/
    private BigDecimal todayIncome;

    /**
     * Expenditure of today
     **/
    private BigDecimal todayExpenditure;

    /**
     * Account type
     **/
    private String accountType;

    /**
     * Settled amount (available to settle)
     **/
    private BigDecimal settledAmount;

    /**
     * User ID
     **/
    private String userNo;

    // -- getter && setter --

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getUnavailableBalance() {
        return unavailableBalance;
    }

    public void setUnavailableBalance(BigDecimal unavailableBalance) {
        this.unavailableBalance = unavailableBalance;
    }

    public BigDecimal getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(BigDecimal securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(BigDecimal totalIncome) {
        this.totalIncome = totalIncome;
    }

    public BigDecimal getTotalExpenditure() {
        return totalExpenditure;
    }

    public void setTotalExpenditure(BigDecimal totalExpenditure) {
        this.totalExpenditure = totalExpenditure;
    }

    public BigDecimal getTodayIncome() {
        return todayIncome;
    }

    public void setTodayIncome(BigDecimal todayIncome) {
        this.todayIncome = todayIncome;
    }

    public BigDecimal getTodayExpenditure() {
        return todayExpenditure;
    }

    public void setTodayExpenditure(BigDecimal todayExpenditure) {
        this.todayExpenditure = todayExpenditure;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getSettledAmount() {
        return settledAmount;
    }

    public void setSettledAmount(BigDecimal settledAmount) {
        this.settledAmount = settledAmount;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
