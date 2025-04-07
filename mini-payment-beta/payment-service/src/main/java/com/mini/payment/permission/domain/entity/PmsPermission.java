package com.mini.payment.permission.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;

@Entity
public class PmsPermission extends DomainImpl {

    private static final long serialVersionUID = 1L;

    private String permissionName;
    private String permission;

    public PmsPermission() {
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
