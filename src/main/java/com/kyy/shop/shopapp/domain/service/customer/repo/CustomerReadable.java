package com.kyy.shop.shopapp.domain.service.customer.repo;

import com.kyy.shop.shopapp.domain.entity.CustomerEntity;

import java.util.List;

public interface CustomerReadable {
    CustomerEntity findByUserId(String userId);

    List<CustomerEntity> findByUserIdAll(String userId);
}
