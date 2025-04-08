package com.mini.payment.account.domain.repository.custom.impl;

import com.mini.payment.account.domain.entity.MpAccountHistory;
import com.mini.payment.account.domain.repository.custom.MpAccountHistoryRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Order;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MpAccountHistoryRepositoryImpl implements MpAccountHistoryRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Page<MpAccountHistory> query(MpAccountHistory param, Pageable pageable) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<MpAccountHistory> cq = cb.createQuery(MpAccountHistory.class);
        Root<MpAccountHistory> root = cq.from(MpAccountHistory.class);
        List<Predicate> predicates = new ArrayList<>();

        if (StringUtils.hasText(param.getAccountNo())) {
            predicates.add(cb.equal(root.get("accountNo"), param.getAccountNo()));
        }

        if (StringUtils.hasText(param.getUserNo())) {
            predicates.add(cb.equal(root.get("userNo"), param.getUserNo()));
        }

        if (StringUtils.hasText(param.getTransactionType())) {
            predicates.add(cb.equal(root.get("transactionType"), param.getTransactionType()));
        }

        if (param.getAmount() != null) {
            predicates.add(cb.equal(root.get("amount"), param.getAmount()));
        }

        // add condition
        cq.where(cb.and(predicates.toArray(new Predicate[0])));

        // add ordering
        if (!pageable.getSort().isEmpty()) {
            List<Order> orders = new ArrayList<>();
            for (Sort.Order order : pageable.getSort()) {
                orders.add(order.isAscending() ?
                        cb.asc(root.get(order.getProperty())) :
                        cb.desc(root.get(order.getProperty())));
            }
            cq.orderBy(orders);
        }

        // add paging
        TypedQuery<MpAccountHistory> query = entityManager.createQuery(cq);
        query.setFirstResult((int) pageable.getOffset());
        query.setMaxResults(pageable.getPageSize());
        List<MpAccountHistory> resultList = query.getResultList();

        // count query
        CriteriaQuery<Long> countQuery = cb.createQuery(Long.class);
        Root<MpAccountHistory> countRoot = countQuery.from(MpAccountHistory.class);
        countQuery.select(cb.count(countRoot));
        List<Predicate> countPredicates = new ArrayList<>();

        if (StringUtils.hasText(param.getAccountNo())) {
            countPredicates.add(cb.equal(countRoot.get("accountNo"), param.getAccountNo()));
        }

        if (StringUtils.hasText(param.getUserNo())) {
            countPredicates.add(cb.equal(countRoot.get("userNo"), param.getUserNo()));
        }

        if (StringUtils.hasText(param.getTransactionType())) {
            countPredicates.add(cb.equal(countRoot.get("transactionType"),
                    param.getTransactionType()));
        }

        if (param.getAmount() != null) {
            countPredicates.add(cb.equal(countRoot.get("amount"), param.getAmount()));
        }

        countQuery.where(cb.and(countPredicates.toArray(new Predicate[0])));
        Long total = entityManager.createQuery(countQuery).getSingleResult();
        return new PageImpl<>(resultList, pageable, total);
    }
}
