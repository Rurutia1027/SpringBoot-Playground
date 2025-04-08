package com.mini.payment.account.domain.service.impl;

import com.mini.payment.account.domain.service.MpUserInfoService;
import com.mini.payment.user.domain.entity.MpUserInfo;
import com.mini.payment.user.domain.repository.MpUserInfoRepository;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mpUserInfoService")
public class MpUserInfoServiceImpl implements MpUserInfoService {
    @Autowired
    private MpUserInfoRepository mpUserInfoRepository;

    @Override
    public MpUserInfo getRecordByMerchentNo(String userNo) {
        if (StringUtils.isEmpty(userNo)) {
            return null;
        }
        return mpUserInfoRepository.findByUserNo(userNo);
    }
}
