package com.mini.payment.reconciliation.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
class MpAccountCheckMistakeRepositoryTest {
    @Autowired
    private MpAccountCheckMistakeRepository mpAccountCheckMistakeRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(mpAccountCheckMistakeRepository);
    }

}