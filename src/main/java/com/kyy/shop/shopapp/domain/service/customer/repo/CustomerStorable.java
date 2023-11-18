package com.kyy.shop.shopapp.domain.service.customer.repo;

import com.kyy.shop.shopapp.domain.entity.CustomerEntity;

public interface CustomerStorable {
    void save(CustomerEntity customerEntity);
    void delete(String userId);
    void update(String userId, CustomerEntity customerEntity);
}
