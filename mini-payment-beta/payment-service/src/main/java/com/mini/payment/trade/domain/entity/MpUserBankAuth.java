package com.mini.payment.trade.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;

@Entity
public class MpUserBankAuth extends DomainImpl {
    private String merchantNo;
    private String payOrderNo;
    private String userName;
    private String phone;
    private String idNo;
    private String bankAccountNo;

    // -- getter && setter --

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }
}
