package com.study.springboot20221peng.dto;

import lombok.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Setter
@Getter
@ToString
//Setter  Getter 모두 필요
public class ProductDto {

    private String productCode;
    private String productName;
    private String price;
    private String stock;


}
