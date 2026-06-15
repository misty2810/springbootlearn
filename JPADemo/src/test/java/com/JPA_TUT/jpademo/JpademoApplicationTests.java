package com.JPA_TUT.jpademo;

import com.JPA_TUT.jpademo.Repository.productRepository;
import com.JPA_TUT.jpademo.entities.productEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpademoApplicationTests {

    @Autowired
    productRepository productRepository;

	@Test
	void contextLoads() {
	}

//    @Test
//    void testRepository(){
//        productEntity product = productEntity.builder()
//                .sku("SKU009")
//                .title("iPhone 9")
//                .price(new BigDecimal("6000.99"))
//                .quantity(8)
//                .build();
//        productEntity savedproductEntity= productRepository.save(product);
//        System.out.println(savedproductEntity);
//    }

//    @Test
//    void getRepository(){
////        List<productEntity> entities= productRepository.findByTitle("iPhone 10");
////        System.out.println(entities);
//        Optional<productEntity> entity= productRepository.findByTitleandPrice("iPhone 9",BigDecimal.valueOf(6000.99));
//        System.out.println(entity);
//    }
}
