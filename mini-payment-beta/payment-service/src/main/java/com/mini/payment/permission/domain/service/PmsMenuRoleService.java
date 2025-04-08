package com.mini.payment.permission.domain.service;

public interface PmsMenuRoleService {
    int countMenuByRoleId(Long roleId);

    void deleteByRoleId(Long roleId);

    void saveRoleMenu(Long roleId, String roleMenuStr);
}
