package com.SpringSecurity.Spring_Boot_Security_demo.repositories;

import com.SpringSecurity.Spring_Boot_Security_demo.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
