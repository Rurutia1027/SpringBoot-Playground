package com.mini.payment.account.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class MpSettRecord extends DomainImpl implements Serializable {
    private static final long serialVersionUID = 9976732227359104L;

    /**
     * Settlement initiation mode (see enum: SettModeTypeEnum)
     **/
    private String settMode;

    /**
     * Account number
     **/
    private String accountNo;

    /**
     * User ID
     **/
    private String userNo;

    /**
     * User type
     **/
    private String userType;

    /**
     * User name
     **/
    private String userName;

    /**
     * Settlement date
     **/
    private Date settDate;

    /**
     * Bank code
     **/
    private String bankCode;

    /**
     * Bank name
     **/
    private String bankName;

    /**
     * Bank account holder name
     **/
    private String bankAccountName;

    /**
     * Bank account number
     **/
    private String bankAccountNo;

    /**
     * Bank account type (e.g., personal, corporate)
     **/
    private String bankAccountType;

    /**
     * Bank country
     **/
    private String country;

    /**
     * Bank province
     **/
    private String province;

    /**
     * Bank city
     **/
    private String city;

    /**
     * Bank area/district
     **/
    private String areas;

    /**
     * Full bank branch name
     **/
    private String bankAccountAddress;

    /**
     * Recipient's mobile number
     **/
    private String mobileNo;

    /**
     * Settlement amount
     **/
    private BigDecimal settAmount = BigDecimal.ZERO;

    /**
     * Settlement fee
     **/
    private BigDecimal settFee = BigDecimal.ZERO;

    /**
     * Final remittance amount (settAmount - fee)
     **/
    private BigDecimal remitAmount = BigDecimal.ZERO;

    /**
     * Settlement status (see enum: SettRecordStatusEnum)
     **/
    private String settStatus;

    /**
     * Remittance request time
     **/
    private Date remitRequestTime;

    /**
     * Remittance confirmation time
     **/
    private Date remitConfirmTime;

    /**
     * Remittance remarks
     **/
    private String remitRemark;

    /**
     * Operator's login name
     **/
    private String operatorLoginname;

    /**
     * Operator's real name
     **/
    private String operatorRealname;

}
