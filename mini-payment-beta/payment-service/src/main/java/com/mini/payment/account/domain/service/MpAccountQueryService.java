package com.mini.payment.account.domain.service;

import com.mini.payment.account.domain.entity.MpAccount;
import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.account.domain.vo.DailyCollectAccountHistoryVo;
import com.mini.payment.exception.BizException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MpAccountQueryService {
    MpAccount getAccountByAccountNo(String accountNo) throws BizException;

    MpAccount getAccountByUserNo(String userNo) throws BizException;

    Page<MpAccountHistory> queryAccountHistoryListPage(String accountNo, Pageable pageable);

    Page<MpAccountHistory> queryAccountHistoryListPageByRole(MpAccountHistory params, Pageable pageable);

    MpAccountHistory getAccountHistoryListPageByAccountNo_requestNo_trxType(MpAccountHistory params, Pageable pageable);

    List<DailyCollectAccountHistoryVo> listDailyCollectAccount(MpAccountHistory params,
                                                               Pageable pageable);

    Page<MpAccount> queryAccountListPage(MpAccount param, Pageable pageable);

    Page<MpAccountHistory> queryAccountHistoryListPage(MpAccountHistory mpAccountHistory,
                                                       Pageable pageable);

    List<MpAccount> listAll() throws BizException;
}
