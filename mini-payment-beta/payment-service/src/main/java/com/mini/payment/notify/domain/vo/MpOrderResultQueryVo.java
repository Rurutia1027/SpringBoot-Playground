package com.mini.payment.notify.domain.vo;

import com.mini.payment.domain.DomainImpl;
import com.mini.payment.notify.enums.NotifyStatusEnum;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Data
public class MpOrderResultQueryVo extends DomainImpl {
    private String notifyRule;
    private Date lastNotifyTime;
    private Integer notifyTimes;
    private Integer limitNotifyTimes;
    private String bankOrderNo;

    public MpOrderResultQueryVo() {
        super();
    }

    public MpOrderResultQueryVo(Date createTime, String notifyRule,
                                Date lastNotifyTime, Integer notifyTimes,
                                Integer limitNotifyTimes,
                                String bankOrderNo, NotifyStatusEnum status) {
        super();
        super.setCreateTime(createTime);
        this.notifyRule = notifyRule;
        this.lastNotifyTime = lastNotifyTime;
        this.notifyTimes = notifyTimes;
        this.limitNotifyTimes = limitNotifyTimes;
        this.bankOrderNo = bankOrderNo;
        super.setStatus(status.name());
    }

    public Map<Integer, Integer> getNotifyRuleMap() {
        return (Map) JSONObject.parseObject(getNotifyRule());
    }


    public String getNotifyRule() {
        return notifyRule;
    }

    public void setNotifyRule(String notifyRule) {
        this.notifyRule = notifyRule;
    }

    public Date getLastNotifyTime() {
        return lastNotifyTime;
    }

    public void setLastNotifyTime(Date lastNotifyTime) {
        this.lastNotifyTime = lastNotifyTime;
    }

    public Integer getNotifyTimes() {
        return notifyTimes;
    }

    public void setNotifyTimes(Integer notifyTimes) {
        this.notifyTimes = notifyTimes;
    }

    public Integer getLimitNotifyTimes() {
        return limitNotifyTimes;
    }

    public void setLimitNotifyTimes(Integer limitNotifyTimes) {
        this.limitNotifyTimes = limitNotifyTimes;
    }

    public String getBankOrderNo() {
        return bankOrderNo;
    }

    public void setBankOrderNo(String bankOrderNo) {
        this.bankOrderNo = bankOrderNo;
    }
}
