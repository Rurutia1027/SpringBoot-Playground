package com.mini.payment.account.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class MpSettDailyCollect extends DomainImpl implements Serializable {
    private static final long serialVersionUID = 4096169383852235862L;

    /**
     * Account number
     **/
    private String accountNo;

    /**
     * User name
     **/
    private String userName;

    /**
     * Collection date (daily summary date)
     **/
    private Date collectDate;

    /**
     * Collection type (see enum: SettDailyCollectTypeEnum)
     **/
    private String collectType;

    /**
     * Settlement batch number (written back after settlement)
     **/
    private String batchNo;

    /**
     * Total transaction amount
     **/
    private BigDecimal totalAmount = BigDecimal.ZERO;

    /**
     * Total number of transactions
     **/
    private Integer totalCount = 0;

    /**
     * Settlement status (see enum: SettDailyCollectStatusEnum)
     **/
    private String settStatus;

    /**
     * Risk withholding period (in days)
     **/
    private Integer riskDay;
}
