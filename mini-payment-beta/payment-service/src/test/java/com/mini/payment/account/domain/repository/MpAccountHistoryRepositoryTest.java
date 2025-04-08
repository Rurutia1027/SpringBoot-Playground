package com.mini.payment.account.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.utils.StringUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
public class MpAccountHistoryRepositoryTest {
    @Autowired
    private MpAccountHistoryRepository mpAccountHistoryRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(mpAccountHistoryRepository);
    }

    @Test
    public void saveItem() {
        MpAccountHistory item = new MpAccountHistory();
        item.setAccountNo(StringUtil.get32UUID());
        item.setAmount(BigDecimal.TEN);
        item.setBankTransactionNo(StringUtil.get32UUID());
        item.setCreateTime(new Date());
        MpAccountHistory ret = mpAccountHistoryRepository.save(item);
        Assertions.assertTrue(ret.getId() > 0);
        MpAccountHistory queryItem =
                mpAccountHistoryRepository.findById(ret.getId()).orElse(null);
        Assertions.assertNotNull(queryItem);
    }

    @Test
    @Transactional
    public void updateAmountAndBalance() {
        MpAccountHistory item = new MpAccountHistory();
        item.setAccountNo(StringUtil.get32UUID());
        item.setAmount(BigDecimal.ZERO);
        item.setBalance(BigDecimal.ZERO);
        item.setCreateTime(new Date());
        item.setBankTransactionNo(StringUtil.get32UUID());

        MpAccountHistory ret = mpAccountHistoryRepository.save(item);
        Assertions.assertNotNull(ret);
        Assertions.assertTrue(ret.getId() > 0);
        ret.setAmount(BigDecimal.TEN);
        ret.setBalance(BigDecimal.TEN);
        mpAccountHistoryRepository.updateAmountAndBalance(ret);
        MpAccountHistory queryItem =
                mpAccountHistoryRepository.findById(ret.getId()).orElse(null);
        Assertions.assertTrue(queryItem.getAmount().equals(BigDecimal.TEN));
        Assertions.assertNotNull(queryItem);
    }
}