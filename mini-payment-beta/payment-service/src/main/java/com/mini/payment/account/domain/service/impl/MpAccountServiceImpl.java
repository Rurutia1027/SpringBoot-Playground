package com.mini.payment.account.domain.service.impl;

import com.mini.payment.account.domain.entity.MpAccount;
import com.mini.payment.account.domain.repository.MpAccountRepository;
import com.mini.payment.account.domain.service.MpAccountService;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class MpAccountServiceImpl implements MpAccountService {
    @Autowired
    private MpAccountRepository mpAccountRepository;

    @Override
    public Page<MpAccount> listPage(MpAccount mpAccount, Pageable pageable) {
        Specification<MpAccount> spec = (root, query, cb) -> {
            List<Predicate> predicateList = new ArrayList<>();

            if (Objects.nonNull(mpAccount.getAccountNo()) && StringUtils.isNotEmpty(mpAccount.getAccountNo())) {
                predicateList.add(cb.equal(root.get("accountNo"), mpAccount.getAccountNo()));
            }

            if (Objects.nonNull(mpAccount.getUserNo()) && StringUtils.isNotEmpty(mpAccount.getUserNo())) {
                predicateList.add(cb.equal(root.get("userNo"), mpAccount.getUserNo()));
            }

            if (Objects.nonNull(mpAccount.getAccountType()) && StringUtils.isNotEmpty(mpAccount.getAccountType())) {
                predicateList.add(cb.equal(root.get("accountType"),
                        mpAccount.getAccountType()));
            }
            return cb.and(predicateList.toArray(new Predicate[0]));
        };
        return mpAccountRepository.findAll(spec, pageable);
    }
}
