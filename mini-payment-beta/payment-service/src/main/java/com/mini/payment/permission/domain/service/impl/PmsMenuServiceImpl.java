package com.mini.payment.permission.domain.service.impl;

import com.mini.payment.permission.domain.entity.PmsMenu;
import com.mini.payment.permission.domain.repository.PmsMenuRepository;
import com.mini.payment.permission.domain.service.PmsMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service("pmsMenuService")
public class PmsMenuServiceImpl implements PmsMenuService {
    @Autowired
    private PmsMenuRepository pmsMenuRepository;

    @Override
    public PmsMenu saveMenu(PmsMenu menu) {
        return pmsMenuRepository.save(menu);
    }

    @Override
    public List<PmsMenu> getListByParentMenuId(Long parentId) {
        return pmsMenuRepository.findByParentId(parentId);
    }

    @Override
    public void deleteMenuById(Long id) {
        pmsMenuRepository.deleteById(id);
    }

    @Override
    public List<PmsMenu> listByRoleIds(Set<Long> roleIds) {
        return pmsMenuRepository.findByRoleIds(roleIds);
    }

    @Override
    public List<PmsMenu> listByParentId(Long parentId) {
        return pmsMenuRepository.findByParentId(parentId);
    }

    @Override
    public List<PmsMenu> getMenuByNameAndIsLeaf(Set<String> menuNames, boolean isLeaf) {
        return pmsMenuRepository.findByMenuNamesAndIsLeaf(menuNames, isLeaf);
    }

    @Override
    public PmsMenu getById(Long pid) {
        return pmsMenuRepository.findById(pid).orElse(null);
    }

    @Override
    public PmsMenu update(PmsMenu menu) {
        return pmsMenuRepository.save(menu);
    }

    @Override
    public Set<Long> getMenuIdsByRoleId(Long roleId) {
        Set<Long> ret = pmsMenuRepository.findByRoleId(roleId).stream()
                .map(item -> item.getId()).collect(Collectors.toSet());
        return ret;
    }
}
