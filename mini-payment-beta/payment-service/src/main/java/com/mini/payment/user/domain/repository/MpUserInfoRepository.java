package com.mini.payment.user.domain.repository;

import com.mini.payment.repository.BaseRepository;
import com.mini.payment.user.domain.entity.MpUserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MpUserInfoRepository extends BaseRepository<MpUserInfo> {
    @Query("SELECT u FROM MpUserInfo  u WHERE u.userNo = :userNo")
    MpUserInfo findByUserNo(@Param("userNo") String userNo);
}
