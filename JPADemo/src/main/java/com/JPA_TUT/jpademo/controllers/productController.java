package com.JPA_TUT.jpademo.controllers;


import com.JPA_TUT.jpademo.Repository.productRepository;
import com.JPA_TUT.jpademo.entities.productEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class productController {
    private final int PAGE_SIZE=2;

    private final productRepository ProductRepository;


    public productController(productRepository productRepository) {
        ProductRepository = productRepository;
    }
    @GetMapping
    public List<productEntity> getAllproduct(
            @RequestParam(defaultValue = "id") String sortby,
            @RequestParam(defaultValue = "0") Integer pagenumber

    ){
//        return ProductRepository.findBy(Sort.by(Sort.Direction.DESC, sortby));
        Pageable pageable= PageRequest.of(pagenumber, PAGE_SIZE, Sort.by(sortby));
        return ProductRepository.findAll(pageable).getContent();
    }
}
