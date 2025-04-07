package com.mini.payment.notify.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Data
public class MpNotifyRecordLog extends DomainImpl {
    private String notifyId;
    private String request;
    private String response;
    private String merchantNo;
    private String merchantOrderNo;
    private Integer httpStatus;

    public MpNotifyRecordLog(Date createTime, String notifyId, String request, String response,
                             String merchantNo, String merchantOrderNo, Integer httpStatus) {
        super();
        super.setCreateTime(createTime);
        this.notifyId = notifyId;
        this.request = request;
        this.response = response;
        this.merchantNo = merchantNo;
        this.merchantOrderNo = merchantOrderNo;
        this.httpStatus = httpStatus;
    }

    public MpNotifyRecordLog() {
        super();
    }
}
