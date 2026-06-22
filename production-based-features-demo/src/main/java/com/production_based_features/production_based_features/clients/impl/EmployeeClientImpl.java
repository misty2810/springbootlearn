package com.production_based_features.production_based_features.clients.impl;

import com.production_based_features.production_based_features.advices.ApiResponse;
import com.production_based_features.production_based_features.clients.EmployeeClient;
import com.production_based_features.production_based_features.dto.EmployeeDTO;
import com.production_based_features.production_based_features.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeClientImpl implements EmployeeClient {

    private final RestClient restClient;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        try {
            return restClient.get()
                    .uri("emp")
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError, (req, res) -> {
                        throw new ResourceNotFoundException("could not find employees");
                    })
                    .body(new ParameterizedTypeReference<List<EmployeeDTO>>() {
                    });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
        try {
            return restClient.get()
                    .uri("emp/{employeeId}", employeeId)
                    .retrieve()
                    .onStatus(HttpStatusCode::is4xxClientError, (req, res) -> {
                        throw new ResourceNotFoundException("could not find employee");
                    })
                    .body(EmployeeDTO.class);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {

        try {
            EmployeeDTO savedEmployee =
                    restClient.post()
                            .uri("emp")
                            .body(employeeDTO)
                            .retrieve()
                            .onStatus(HttpStatusCode::is4xxClientError, (req, res) -> {
                                throw new ResourceNotFoundException("could not create employee");
                            })
                            .body(EmployeeDTO.class);

            return savedEmployee;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
