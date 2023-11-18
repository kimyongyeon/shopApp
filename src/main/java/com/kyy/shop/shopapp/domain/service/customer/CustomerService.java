package com.kyy.shop.shopapp.domain.service.customer;

import com.kyy.shop.shopapp.domain.dto.CustomerDTO;
import com.kyy.shop.shopapp.domain.entity.CustomerEntity;
import jakarta.servlet.http.HttpServletRequest;

public interface CustomerService {

    // 회원가입
    void register(CustomerDTO customer);

    // 회원조회
    CustomerEntity getCustomer(String userId);

    // 회원수정
    void modify(String userId, CustomerEntity customer);

    // 회원탈퇴
    void remove(String userId);

    // 패스워드 재정의
    void redefPassword(String userId, String password);

    // 로그인
    boolean isLogin(CustomerDTO customerDTO, HttpServletRequest request);

}
