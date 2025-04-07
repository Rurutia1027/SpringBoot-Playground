package com.mini.payment.permission.domain.entity;

import com.mini.payment.domain.DomainImpl;
import jakarta.persistence.Entity;

@Entity
public class PmsMenuRole extends DomainImpl {
    private static final long serialVersionUID = 123456789987654L;

    private Long roleId;
    private Long menuId;

    // -- getter & setter --

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}
