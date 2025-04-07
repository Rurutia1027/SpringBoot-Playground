package com.mini.payment.trade.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
class MpTradePaymentOrderRepositoryTest {
    @Autowired
    private MpTradePaymentOrderRepository mpTradePaymentOrderRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(mpTradePaymentOrderRepository);
    }

}