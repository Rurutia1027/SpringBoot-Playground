package com.mini.payment.permission.domain.service.impl;

import com.mini.payment.permission.domain.entity.PmsOperatorLog;
import com.mini.payment.permission.domain.service.PmsOperatorLogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("pmsOperatorLogService")
public class PmsOperatorLogServiceImpl implements PmsOperatorLogService {
    @Override
    public PmsOperatorLog saveData(PmsOperatorLog pmsOperatorLog) {
        return null;
    }

    @Override
    public PmsOperatorLog updateData(PmsOperatorLog pmsOperatorLog) {
        return null;
    }

    @Override
    public PmsOperatorLog getDataById(Long id) {
        return null;
    }

    @Override
    public Page<PmsOperatorLog> listPage(PmsOperatorLog param, Pageable pageable) {
        return null;
    }
}
