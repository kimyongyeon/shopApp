package com.kyy.shop.shopapp.infra.customer;

import com.kyy.shop.shopapp.domain.entity.CustomerEntity;
import com.kyy.shop.shopapp.domain.service.customer.repo.CustomerReadable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CustomerReadableImpl implements CustomerReadable {

    private final CustomerRepository repository;

    @Override
    public CustomerEntity findByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<CustomerEntity> findByUserIdAll(String userId) {
        return repository.findAllByUserId(userId);
    }
}
