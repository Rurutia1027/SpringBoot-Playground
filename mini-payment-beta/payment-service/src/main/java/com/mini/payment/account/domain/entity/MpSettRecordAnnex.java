package com.mini.payment.account.domain.entity;

import com.mini.payment.domain.DomainImpl;
import com.mini.payment.enums.PublicEnum;
import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serializable;

@Entity
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

    // -- getter && setter --

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getAnnexName() {
        return annexName;
    }

    public void setAnnexName(String annexName) {
        this.annexName = annexName;
    }

    public String getAnnexAddress() {
        return annexAddress;
    }

    public void setAnnexAddress(String annexAddress) {
        this.annexAddress = annexAddress;
    }

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId;
    }
}
