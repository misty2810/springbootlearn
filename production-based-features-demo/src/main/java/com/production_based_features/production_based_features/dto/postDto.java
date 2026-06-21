package com.production_based_features.production_based_features.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class postDto {
    private Long postid;
    private String title;
    private String description;
}
