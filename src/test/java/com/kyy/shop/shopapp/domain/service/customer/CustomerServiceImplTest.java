package com.kyy.shop.shopapp.domain.service.customer;

import com.kyy.shop.shopapp.domain.dto.CustomerDTO;
import com.kyy.shop.shopapp.domain.entity.CustomerEntity;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    @Order(1)
    void register() {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setUserId("testMemberId");
        customerDTO.setPassword("test12344");
        customerDTO.setName("testMan");
        customerService.register(customerDTO);

        CustomerEntity test = customerService.getCustomer("testMemberId");

        assertEquals("testMemberId", test.getUserId());

    }

    @Test
    @Order(2)
    void getCustomer() {
        CustomerEntity test = customerService.getCustomer("testMemberId");
        assertEquals("testMemberId", test.getUserId());
    }

    @Test
    @Order(3)
    void isLogin() {

    }
}