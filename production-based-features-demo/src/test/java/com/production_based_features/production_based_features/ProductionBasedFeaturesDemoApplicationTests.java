package com.production_based_features.production_based_features;

import com.production_based_features.production_based_features.clients.EmployeeClient;
import com.production_based_features.production_based_features.dto.EmployeeDTO;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class ProductionBasedFeaturesDemoApplicationTests {
    @Autowired
    private EmployeeClient employeeClient;

    @Test
    void getAllEmployeesTest() {
        List<EmployeeDTO> employeeDTOList = employeeClient.getAllEmployees();
        System.out.println(employeeDTOList);
    }

    @Test
    void getEmployeeByIdTest() {
        EmployeeDTO employeeDTO = employeeClient.getEmployeeById(1L);
        System.out.println(employeeDTO);
    }

    @Test
    void createNewEmployeeTest() {
        EmployeeDTO employeeDTO = new EmployeeDTO(null, "shubham", "shubham@gmail.com", 24, LocalDate.of(2020, 12, 1), true);
        EmployeeDTO savedEmployeeDTO = employeeClient.createNewEmployee(employeeDTO);
        System.out.println(savedEmployeeDTO);
    }

}
