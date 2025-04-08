package com.mini.payment.account.domain.service;

import com.mini.payment.account.domain.entity.MpAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MpAccountService {
    Page<MpAccount> listPage(MpAccount mpAccount, Pageable pageable);
}
