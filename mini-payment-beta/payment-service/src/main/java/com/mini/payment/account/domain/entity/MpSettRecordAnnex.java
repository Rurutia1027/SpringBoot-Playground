package com.mini.payment.account.domain.entity;

import com.mini.payment.domain.DomainImpl;
import com.mini.payment.enums.PublicEnum;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class MpSettRecordAnnex extends DomainImpl implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Whether deleted (default: NO, see enum: PublicEnum)
     **/
    private String isDelete = PublicEnum.NO.name();

    /**
     * Attachment name
     **/
    private String annexName;

    /**
     * Attachment URL or file path
     **/
    private String annexAddress;

    /**
     * Associated settlement ID
     **/
    private String settlementId;
}
