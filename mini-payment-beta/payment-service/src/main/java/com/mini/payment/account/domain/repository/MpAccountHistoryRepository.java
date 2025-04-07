package com.mini.payment.account.domain.repository;

import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MpAccountHistoryRepository extends BaseRepository<MpAccountHistory> {
}
