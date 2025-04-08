package com.mini.payment.permission.domain.service;

import com.mini.payment.permission.domain.entity.PmsMenu;

import java.util.List;
import java.util.Set;

public interface PmsMenuService {
    PmsMenu saveMenu(PmsMenu menu);

    List<PmsMenu> getListByParentMenuId(Long parentId);

    void deleteMenuById(Long id);

    List<PmsMenu> listByRoleIds(Set<Long> menuNames);

    List<PmsMenu> listByParentId(Long parentId);

    List<PmsMenu> getMenuByNameAndIsLeaf(Set<String> menuNames, boolean isLeaf);

    PmsMenu getById(Long pid);

    PmsMenu update(PmsMenu menu);

    Set<Long> getMenuIdsByRoleId(Long roleId);
}
