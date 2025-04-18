package com.mini.payment.notify.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
public class MpNotifyRecordRepositoryTest {
    @Autowired
    private MpNotifyRecordRepository mpNotifyRecordRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(mpNotifyRecordRepository);
    }
}