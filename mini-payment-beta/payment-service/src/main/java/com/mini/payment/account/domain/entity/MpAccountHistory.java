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
}
