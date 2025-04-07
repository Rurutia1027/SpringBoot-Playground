package com.mini.payment;

import com.mini.payment.account.domain.entity.MpAccount;
import com.mini.payment.account.domain.repository.MpAccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootApplication(scanBasePackages = "com.mini.payment")
public class PaymentServiceApplicationTest {
}