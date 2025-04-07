package com.mini.payment.account.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
public class MpAccountRepositoryTest {
    @Autowired
    private MpAccountRepository mpAccountRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(mpAccountRepository);
    }
}