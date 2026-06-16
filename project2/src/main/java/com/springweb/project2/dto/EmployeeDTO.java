package com.springweb.project2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springweb.project2.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    @NotNull(message = "required field")
    private String name;
    private String email;
    private Integer age;
    @EmployeeRoleValidation
    private String role;
    private LocalDate dateofjoining;

    @JsonProperty("isActive")
    private Boolean isActive;
}
