package com.mini.payment.account.domain.repository;

import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.repository.BaseRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MpAccountHistoryRepository extends BaseRepository<MpAccountHistory> {
    @Modifying
    @Query("UPDATE MpAccountHistory a SET a.amount = :#{#e.amount}, a.balance = :#{#e.balance} WHERE a.id = :#{#e.id}")
    void updateAmountAndBalance(@Param("e") MpAccountHistory e);
}
