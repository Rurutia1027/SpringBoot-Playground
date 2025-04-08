package com.mini.payment.account.domain.service;

import com.mini.payment.account.domain.dto.MpAccountHistoryCondition;
import com.mini.payment.account.domain.entity.MpAccountHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MpAccountHistoryService {
    void saveData(MpAccountHistory mpAccountHistory);

    void updateAmountAndBalance(MpAccountHistory mpAccountHistory);

    MpAccountHistory getDataById(String id);

    Page<MpAccountHistory> listPage(MpAccountHistoryCondition condition, Pageable pageable);
}
