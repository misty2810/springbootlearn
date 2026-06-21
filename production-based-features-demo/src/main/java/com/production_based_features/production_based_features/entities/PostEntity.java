package com.production_based_features.production_based_features.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Audited;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class PostEntity extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postid;

    private String title;
    private String description;

    @PrePersist
    void beforeSave() {
        System.out.println("before new entity is saved");
    }

    @PreUpdate
    void beforeUpdate() {
        System.out.println("before new entity is updated");
    }

    @PreRemove
    void beforeDelete() {
        System.out.println("before new entity is deleted");
    }

}
