package com.mini.payment.account.domain.repository;

import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.account.domain.repository.custom.MpAccountHistoryRepositoryCustom;
import com.mini.payment.repository.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MpAccountHistoryRepository extends  BaseRepository<MpAccountHistory>, MpAccountHistoryRepositoryCustom {
    @Modifying
    @Query("UPDATE MpAccountHistory a SET a.amount = :#{#e.amount}, a.balance = :#{#e.balance} WHERE a.id = :#{#e.id}")
    void updateAmountAndBalance(@Param("e") MpAccountHistory e);
}
