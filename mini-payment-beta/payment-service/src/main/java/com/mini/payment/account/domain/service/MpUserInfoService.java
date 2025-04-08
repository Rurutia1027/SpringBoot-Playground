package com.mini.payment.account.domain.service;

import com.mini.payment.user.domain.entity.MpUserInfo;

public interface MpUserInfoService {
    MpUserInfo getRecordByMerchentNo(String userNo);
}
