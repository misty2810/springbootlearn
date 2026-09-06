package com.SpringSecurity.Spring_Boot_Security_demo.repositories;

import com.SpringSecurity.Spring_Boot_Security_demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringSecurity.Spring_Boot_Security_demo.entities.Session;
import java.util.List;
import java.util.Optional;

public interface SessionRepository extends JpaRepository<Session, Long> {
    List<Session> findByUser(User user);

    Optional<Session> findByRefreshToken(String refreshToken);
}
