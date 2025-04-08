package com.mini.payment.account.domain.service;

import com.mini.payment.account.domain.entity.MpSettRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MpSettQueryService {

    Page<MpSettRecord> querySettRecordListPage(MpSettRecord mpSettRecord, Pageable pageable);

}
