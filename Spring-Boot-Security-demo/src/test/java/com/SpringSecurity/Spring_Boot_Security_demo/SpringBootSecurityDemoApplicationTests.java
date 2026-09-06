package com.SpringSecurity.Spring_Boot_Security_demo;

import com.SpringSecurity.Spring_Boot_Security_demo.entities.User;
import com.SpringSecurity.Spring_Boot_Security_demo.entities.enums.Role;
import com.SpringSecurity.Spring_Boot_Security_demo.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
class SpringBootSecurityDemoApplicationTests {
    @Autowired
    private JwtService jwtService;
	@Test
	void contextLoads() {
        User user = User.builder()
                .id(4L)
                .email("misty@gmail.com")
                .password("1234")
                .name("Misty")
                .roles(Set.of(Role.USER))
                .build();

        String token = jwtService.generateAccessToken(user);

        System.out.println(token);

        //Long id = jwtService.getUserIdFromToken("eyJhbGciOiJIUzM4NCJ9" +
               //".eyJzdWIiOiI0IiwiZW1haWwiOiJhbnVqQGdtYWlsLmNvbSIsInJvbGVzIjpbIlVTRVIiLCJBRE1JTiJdLCJpYXQiOjE3MjE2NTMyNTgsImV4cCI6MTcyMTY1MzMxOH0.fhjAtKv56iN9XsyPxNh6V3rr6Eds9LuWVkqklcRQNzgTq7GY-46TG2LFvyDshiZe");

        //System.out.println(id);
	}

}
