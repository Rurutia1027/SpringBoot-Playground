package com.mini.payment.notify.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class MpNotifyRecord extends DomainImpl {

    private Date lastNotifyTime;
    private Integer notifyTimes = 0;
    private Integer limitNotifyTimes = 5;
    private String url;
    private String merchantNo;
    private String merchantOrderNo;
    private String notifyType;

    public MpNotifyRecord() {
        super();
    }

    public MpNotifyRecord(Date createTime, Date lastNotifyTime, Integer notifyTimes,
                          Integer limitNotifyTimes, String url, String merchantNo, String merchantOrderNo, String notifyType) {
        super();
        super.setCreateTime(createTime);
        this.lastNotifyTime = lastNotifyTime;
        this.notifyTimes = notifyTimes;
        this.limitNotifyTimes = limitNotifyTimes;
        this.url = url;
        this.merchantNo = merchantNo;
        this.merchantOrderNo = merchantOrderNo;
        this.notifyType = notifyType;
    }
}
