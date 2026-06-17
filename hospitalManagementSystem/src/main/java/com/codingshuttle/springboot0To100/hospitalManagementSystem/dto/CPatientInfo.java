package com.codingshuttle.springboot0To100.hospitalManagementSystem.dto;

import lombok.Data;

@Data
public class CPatientInfo {
    private final Long id;
    private final String name;

    public CPatientInfo(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
