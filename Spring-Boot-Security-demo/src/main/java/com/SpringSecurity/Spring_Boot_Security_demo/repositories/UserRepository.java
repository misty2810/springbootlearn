package com.SpringSecurity.Spring_Boot_Security_demo.repositories;

import com.SpringSecurity.Spring_Boot_Security_demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}

