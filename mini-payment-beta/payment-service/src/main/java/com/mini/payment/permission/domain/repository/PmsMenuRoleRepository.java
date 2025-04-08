package com.mini.payment.permission.domain.repository;

import com.mini.payment.permission.domain.entity.PmsMenuRole;
import com.mini.payment.repository.BaseRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PmsMenuRoleRepository extends BaseRepository<PmsMenuRole> {

    @Query("SELECT COUNT(p) FROM PmsMenuRole p WHERE p.roleId = :roleId")
    int countMenusByRoleId(Long roleId);

    @Modifying
    @Query("DELETE FROM PmsMenuRole p WHERE p.roleId = :roleId")
    void deleteByRoleId(Long roleId);
}
