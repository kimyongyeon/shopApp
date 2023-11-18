package com.kyy.shop.shopapp.infra.customer;

import com.kyy.shop.shopapp.domain.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    CustomerEntity findByUserId(String userId);

    List<CustomerEntity> findAllByUserId(String userId);
}
