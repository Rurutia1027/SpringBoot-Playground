package com.mini.payment.permission.domain.repository;

import com.mini.payment.permission.domain.entity.PmsMenu;
import com.mini.payment.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface PmsMenuRepository extends BaseRepository<PmsMenu> {
    @Query("SELECT m FROM PmsMenu m WHERE m.parent.id = :parentId")
    List<PmsMenu> findByParentId(@Param("parentId") Long parentId);

    @Query("SELECT m FROM PmsMenu m WHERE m.parent.id = :parentId ORDER BY m.id DESC")
    List<PmsMenu> findByParentIdOrderByOrderNoAsc(@Param("parentId") Long parentId);

    @Query("SELECT m FROM PmsMenuRole m WHERE m.id IN (SELECT mr.id FROM PmsMenuRole  mr" +
            " WHERE mr.roleId IN :roleIds)")
    List<PmsMenu> findByRoleIds(@Param("roleIds") Set<Long> roleIds);

    @Query("SELECT m FROM PmsMenu m WHERE m.name IN :menuNames AND m.isLeaf = :isLeaf")
    List<PmsMenu> findByMenuNamesAndIsLeaf(@Param("menuNames") Set<String> menuNames,
                                           @Param("isLeaf") boolean isLeaf);

    @Query("SELECT m FROM PmsMenu m WHERE m.id IN (SELECT mr.id FROM PmsMenuRole mr WHERE mr" +
            ".roleId = :roleId)")
    Set<PmsMenu> findByRoleId(@Param("roleId") Long roleId);
}
