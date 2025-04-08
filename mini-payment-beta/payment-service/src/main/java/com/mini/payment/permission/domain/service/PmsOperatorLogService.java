package com.mini.payment.permission.domain.service;

import com.mini.payment.permission.domain.entity.PmsOperatorLog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PmsOperatorLogService {
    PmsOperatorLog saveData(PmsOperatorLog pmsOperatorLog);

    PmsOperatorLog updateData(PmsOperatorLog pmsOperatorLog);

    PmsOperatorLog getDataById(Long id);

    Page<PmsOperatorLog> listPage(PmsOperatorLog param, Pageable pageable);
}
