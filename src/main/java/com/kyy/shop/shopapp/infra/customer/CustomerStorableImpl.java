package com.kyy.shop.shopapp.infra.customer;

import com.kyy.shop.shopapp.domain.entity.CustomerEntity;
import com.kyy.shop.shopapp.domain.service.customer.repo.CustomerStorable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class CustomerStorableImpl implements CustomerStorable {

    private final CustomerRepository repository;

    @Override
    public void save(CustomerEntity customerEntity) {
        repository.save(customerEntity);
    }

    @Override
    public void delete(String userId) {
        CustomerEntity byUserId = repository.findByUserId(userId);
        repository.delete(byUserId);
    }

    @Override
    public void update(String userId, CustomerEntity customerEntity) {
        CustomerEntity byUserId = repository.findByUserId(userId);
        byUserId.setUserId(customerEntity.getUserId());
        byUserId.setAddr(customerEntity.getAddr());
        byUserId.setName(customerEntity.getName());
        byUserId.setPassword(customerEntity.getPassword());
        repository.save(byUserId);
    }
}
