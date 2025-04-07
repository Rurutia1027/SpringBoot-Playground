package com.mini.payment.permission.domain.repository;

import com.mini.payment.PaymentServiceApplicationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PaymentServiceApplicationTest.class)
public class PmsMenuRoleRepositoryTest {
    @Autowired
    private PmsMenuRoleRepository pmsMenuRoleRepository;

    @Test
    public void initTest() {
        Assertions.assertNotNull(pmsMenuRoleRepository);
    }
}