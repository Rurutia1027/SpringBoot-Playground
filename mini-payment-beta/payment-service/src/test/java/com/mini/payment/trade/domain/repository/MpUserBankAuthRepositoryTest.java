package com.mini.payment.trade.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
class MpUserBankAuthRepositoryTest {
    @Autowired
    private MpUserBankAuthRepository mpUserBankAuthRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(mpUserBankAuthRepository);
    }
}