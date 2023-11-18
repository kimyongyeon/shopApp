package com.kyy.shop.shopapp.domain.service.customer;

import com.kyy.shop.shopapp.domain.dto.CustomerDTO;
import com.kyy.shop.shopapp.domain.entity.CustomerEntity;
import com.kyy.shop.shopapp.domain.service.customer.repo.CustomerReadable;
import com.kyy.shop.shopapp.domain.service.customer.repo.CustomerStorable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerReadable readable;
    private final CustomerStorable storable;

    @Override
    public void register(CustomerDTO customer) {
        CustomerEntity byUserId = readable.findByUserId(customer.getUserId());
        if (byUserId != null) {
            throw new RuntimeException("이미 존재하는 아이디입니다.");
        }
        storable.save(CustomerEntity.of(customer));
    }

    @Override
    public void modify(String userId, CustomerEntity customer) {

    }

    @Override
    public void remove(String userId) {

    }

    @Override
    public void redefPassword(String userId, String password) {

    }

    @Override
    public boolean isLogin(CustomerDTO customerDTO, HttpServletRequest request) {
        HttpSession session = request.getSession();
        CustomerEntity byUserId = readable.findByUserId(customerDTO.getUserId());
        if (byUserId != null) {
            if (byUserId.getPassword().equals(customerDTO.getPassword())) {
                session.setAttribute("login", byUserId.getUserId());
                return true;
            }
        }
        return false;
    }
}
