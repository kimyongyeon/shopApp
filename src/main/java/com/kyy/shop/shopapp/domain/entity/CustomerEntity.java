package com.kyy.shop.shopapp.domain.entity;

import com.kyy.shop.shopapp.domain.dto.CustomerDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private String addr;
    private String userId;
    private String password;

    public static CustomerEntity of(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setUserId(customerDTO.getUserId());
        customerEntity.setPassword(customerDTO.getPassword());
        customerEntity.setName(customerDTO.getName());
        customerEntity.setAddr(customerDTO.getAddr());
        return customerEntity;
    }


}
