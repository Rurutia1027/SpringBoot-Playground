package com.mini.payment.account.domain.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DailyCollectAccountHistoryVo implements Serializable {
    private String accountNo;
    private Date collectDate;
    private BigDecimal totalAmount = BigDecimal.ZERO;
    private Integer totalNum = 0;
    private Long lastId = 0L;
    private Integer riskDay;

    // -- getter && setter --
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Long getLastId() {
        return lastId;
    }

    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }

    public Integer getRiskDay() {
        return riskDay;
    }

    public void setRiskDay(Integer riskDay) {
        this.riskDay = riskDay;
    }
}
