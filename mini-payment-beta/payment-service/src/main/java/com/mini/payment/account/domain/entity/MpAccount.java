package com.mini.payment.account.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Getter
@Setter
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
}
