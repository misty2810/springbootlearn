package com.JPA_TUT.jpademo.Repository;

import com.JPA_TUT.jpademo.entities.productEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface productRepository extends JpaRepository<productEntity, Long> {

    List<productEntity> findBy(Sort sort);

    List<productEntity> findByTitle(String s);

    @Query("select e from productEntity e where e.title=?1 and e.price=?2")
    Optional<productEntity> findByTitleandPrice(String title, BigDecimal price);
}
