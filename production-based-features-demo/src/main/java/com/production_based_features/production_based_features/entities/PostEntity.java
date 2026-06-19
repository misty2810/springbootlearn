package com.production_based_features.production_based_features.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;


}
