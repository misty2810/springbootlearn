package com.codingshuttle.springboot0To100.hospitalManagementSystem.dto;

import com.codingshuttle.springboot0To100.hospitalManagementSystem.entity.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;

    public BloodGroupStats(BloodGroupType bloodGroupType, Long count) {
        this.bloodGroupType = bloodGroupType;
        this.count = count;
    }
}
