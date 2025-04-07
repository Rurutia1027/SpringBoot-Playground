package com.mini.payment.user.domain.repository;

import com.mini.payment.repository.BaseRepository;
import com.mini.payment.user.domain.entity.MpPayProduct;
import org.springframework.stereotype.Repository;

@Repository
public interface MpPayProductRepository extends BaseRepository<MpPayProduct> {

}