package com.mini.payment.account.domain.repository.custom;

import com.mini.payment.account.domain.dto.MpAccountHistoryCondition;
import com.mini.payment.account.domain.entity.MpAccountHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MpAccountHistoryRepositoryCustom {
    Page<MpAccountHistory> query(MpAccountHistory mpAccountHistory, Pageable pageable);
}
