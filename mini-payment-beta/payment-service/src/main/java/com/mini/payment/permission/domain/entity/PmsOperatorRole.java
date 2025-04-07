package com.mini.payment.permission.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;

@Entity
public class PmsOperatorRole extends DomainImpl {

    private static final long serialVersionUID = 1L;

    private Long roleId;
    private Long operatorId;

    public PmsOperatorRole() {
    }

    // -- getter && setter --

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }
}
