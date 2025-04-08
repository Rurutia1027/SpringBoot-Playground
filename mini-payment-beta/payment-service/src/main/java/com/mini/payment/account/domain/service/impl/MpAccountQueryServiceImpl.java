package com.mini.payment.account.domain.service.impl;

import com.mini.payment.account.domain.entity.MpAccount;
import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.account.domain.service.MpAccountQueryService;
import com.mini.payment.account.domain.vo.DailyCollectAccountHistoryVo;
import com.mini.payment.exception.BizException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mpAccountQueryService")
public class MpAccountQueryServiceImpl implements MpAccountQueryService {
    @Override
    public MpAccount getAccountByAccountNo(String accountNo) throws BizException {
        return null;
    }

    @Override
    public MpAccount getAccountByUserNo(String userNo) throws BizException {
        return null;
    }

    @Override
    public Page<MpAccountHistory> queryAccountHistoryListPage(String accountNo, Pageable pageable) {
        return null;
    }

    @Override
    public Page<MpAccountHistory> queryAccountHistoryListPageByRole(MpAccountHistory params, Pageable pageable) {
        return null;
    }

    @Override
    public MpAccountHistory getAccountHistoryListPageByAccountNo_requestNo_trxType(MpAccountHistory params, Pageable pageable) {
        return null;
    }

    @Override
    public List<DailyCollectAccountHistoryVo> listDailyCollectAccount(MpAccountHistory params, Pageable pageable) {
        return List.of();
    }

    @Override
    public Page<MpAccount> queryAccountListPage(MpAccount param, Pageable pageable) {
        return null;
    }

    @Override
    public Page<MpAccountHistory> queryAccountHistoryListPage(MpAccountHistory mpAccountHistory, Pageable pageable) {
        return null;
    }

    @Override
    public List<MpAccount> listAll() throws BizException {
        return List.of();
    }
}
