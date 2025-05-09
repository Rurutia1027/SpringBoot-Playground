package com.mini.payment.user.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
public class MpUserInfoRepositoryTest {
    @Autowired
    private MpUserInfoRepository mpUserInfoRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(mpUserInfoRepository);
    }
}