package com.SpringSecurity.Spring_Boot_Security_demo.dto;


import com.SpringSecurity.Spring_Boot_Security_demo.entities.enums.Role;
import lombok.Data;

import java.util.Set;

@Data
public class SignUpDto {
    private String email;
    private String password;
    private String name;
    private Set<Role> roles;
}
