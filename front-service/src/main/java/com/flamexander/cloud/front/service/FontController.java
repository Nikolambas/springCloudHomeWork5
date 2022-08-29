package com.flamexander.cloud.front.service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/font")
@RequiredArgsConstructor
public class FontController {


    private final FontRestTemplate fontRestTemplate;


    @GetMapping
    public List<ProductDto> getAllProduct(){
//        return fontRestTemplate.getRestTemplate().getForObject("http://localhost:62939/api/v1/products",List.class);
        return fontRestTemplate.getRestTemplate().getForObject("http://product-service/api/v1/products",List.class);
    }


}
