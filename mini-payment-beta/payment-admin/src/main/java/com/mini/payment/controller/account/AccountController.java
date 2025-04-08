package com.mini.payment.controller.account;

import com.mini.payment.account.domain.entity.MpAccount;
import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.account.domain.service.MpAccountHistoryService;
import com.mini.payment.account.domain.service.MpAccountService;
import com.mini.payment.account.domain.service.MpUserInfoService;
import com.mini.payment.user.domain.entity.MpUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private MpAccountHistoryService mpAccountHistoryService;

    @Autowired
    private MpUserInfoService mpUserInfoService;

    @Autowired
    private MpAccountService mpAccountService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public Page<MpAccount> list(MpAccount mpAccount, Pageable pageable) {
        return mpAccountService.listPage(mpAccount, pageable);
    }

    @RequestMapping(value = "/historyList", method = {RequestMethod.GET, RequestMethod.POST})
    public Page<MpAccountHistory> historyList(MpAccountHistory mpAccountHistory, Pageable pageable) {
        Page<MpAccountHistory> accountHistoryPage =
                mpAccountHistoryService.listPage(mpAccountHistory, pageable);
        List<MpAccountHistory> mpAccountHistories = accountHistoryPage.getContent();
        for (MpAccountHistory item : mpAccountHistories) {
            MpUserInfo userInfo = mpUserInfoService.getRecordByMerchentNo(item.getUserNo());
            item.setUserName(userInfo.getUserName());
        }
        return accountHistoryPage;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
