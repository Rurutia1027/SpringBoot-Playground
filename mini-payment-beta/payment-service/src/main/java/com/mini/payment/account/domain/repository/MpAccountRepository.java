package com.mini.payment.account.domain.repository;

import com.mini.payment.account.domain.entity.MpAccount;
import com.mini.payment.repository.BaseRepository;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MpAccountRepository extends BaseRepository<MpAccount> {
    MpAccount getByAccountNo(String accountNo);
    @Query("SELECT a FROM MpAccount a WHERE a.userNo = :userNo")
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    MpAccount getByUserNoWithPessimisticLock(@Param("userNo") String userNo);
}
