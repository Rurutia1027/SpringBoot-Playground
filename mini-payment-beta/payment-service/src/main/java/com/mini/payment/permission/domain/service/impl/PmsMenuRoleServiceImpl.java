package com.mini.payment.permission.domain.service.impl;

import com.mini.payment.permission.domain.entity.PmsMenuRole;
import com.mini.payment.permission.domain.repository.PmsMenuRoleRepository;
import com.mini.payment.permission.domain.service.PmsMenuRoleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("pmsMenuRoleService")
public class PmsMenuRoleServiceImpl implements PmsMenuRoleService {
    @Autowired
    private PmsMenuRoleRepository pmsMenuRoleRepository;

    @Override
    public int countMenuByRoleId(Long roleId) {
        return pmsMenuRoleRepository.countMenusByRoleId(roleId);
    }

    @Override
    public void deleteByRoleId(Long roleId) {
        pmsMenuRoleRepository.deleteByRoleId(roleId);
    }

    @Transactional
    @Override
    public void saveRoleMenu(Long roleId, String roleMenuStr) {
        // step-1: delete existing mappings
        pmsMenuRoleRepository.deleteByRoleId(roleId);

        // step-2: save new mappings
        if (StringUtils.isNoneBlank(roleMenuStr)) {
            String[] menuIds = roleMenuStr.split(",");
            for (int i = 0; i < menuIds.length; i++) {
                Long menuId = Long.valueOf(menuIds[i]);
                PmsMenuRole item = new PmsMenuRole();
                item.setMenuId(menuId);
                item.setRoleId(roleId);
                pmsMenuRoleRepository.save(item);
            }
        }
    }
}
