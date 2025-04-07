package com.mini.payment.permission.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;

@Entity
public class PmsRolePermission extends DomainImpl {
    private static final long serialVersionUID = 1L;
    private Long roleId;
    private Long permissionId;

    public PmsRolePermission() {
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}
