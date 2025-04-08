package com.mini.payment.account.domain.service.impl;

import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.account.domain.repository.MpAccountHistoryRepository;
import com.mini.payment.account.domain.service.MpAccountHistoryService;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class MpAccountHistoryServiceImpl implements MpAccountHistoryService {
    @Autowired
    private MpAccountHistoryRepository mpAccountHistoryRepository;

    @Override
    public void saveData(MpAccountHistory mpAccountHistory) {
        mpAccountHistoryRepository.save(mpAccountHistory);
    }

    @Override
    @Transactional
    public void updateAmountAndBalance(MpAccountHistory mpAccountHistory) {
        mpAccountHistoryRepository.updateAmountAndBalance(mpAccountHistory);
    }

    @Override
    public MpAccountHistory getDataById(String id) {
        return null;
    }

    @Override
    public Page<MpAccountHistory> listPage(MpAccountHistory param, Pageable pageable) {
        return mpAccountHistoryRepository.findAll((root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (StringUtils.hasText(param.getUserNo())) {
                predicates.add(cb.equal(root.get("userNo"), param.getUserNo()));
            }

            if (StringUtils.hasText(param.getAccountNo())) {
                predicates.add(cb.equal(root.get("accountNo"),
                        param.getAccountNo()));
            }

            if (StringUtils.hasText(param.getTransactionType())) {
                predicates.add(cb.equal(root.get("transactionType"),
                        param.getTransactionType()));
            }

            if (StringUtils.hasText(param.getFundDirection())) {
                predicates.add(cb.equal(root.get("transactionType"),
                        param.getTransactionType()));
            }

            if (StringUtils.hasText(param.getFundDirection())) {
                predicates.add(cb.equal(root.get("fundDirection"), param.getFundDirection()));
            }
            return cb.and(predicates.toArray(new Predicate[0]));
        }, pageable);
    }
}
