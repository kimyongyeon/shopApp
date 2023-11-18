package com.kyy.shop.shopapp.infra.customer;

import com.kyy.shop.shopapp.domain.entity.CustomerEntity;
import com.kyy.shop.shopapp.domain.service.customer.repo.CustomerReadable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerReadableImpl implements CustomerReadable {

    private CustomerRepository repository;

    @Override
    public CustomerEntity findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<CustomerEntity> findByUserIdAll(String userId) {
        return repository.findAllByUserId(userId);
    }
}
