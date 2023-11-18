package com.kyy.shop.shopapp.controller;

import com.kyy.shop.shopapp.domain.dto.CustomerDTO;
import com.kyy.shop.shopapp.domain.service.customer.CustomerService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @PostMapping("/isLogin")
    public boolean isLogin(@RequestBody CustomerDTO customer, HttpServletRequest request) {
        return service.isLogin(customer, request);
    }

    @PostMapping("/register")
    public void register(@RequestBody CustomerDTO customer) {
        service.register(customer);
    }

}
