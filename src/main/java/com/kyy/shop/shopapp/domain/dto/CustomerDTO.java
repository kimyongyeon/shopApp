package com.kyy.shop.shopapp.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {
    String userId;
    String password;
    String name;
    String addr;
}
