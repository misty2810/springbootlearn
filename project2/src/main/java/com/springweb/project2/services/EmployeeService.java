package com.springweb.project2.services;

import com.springweb.project2.dto.EmployeeDTO;
import com.springweb.project2.entities.EmployeeEntity;
import com.springweb.project2.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getemp(Long id) {
        EmployeeEntity employeeEntity=  employeeRepository.findById(id).orElse(null);
        return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }

    public List<EmployeeDTO> getallemp() {
        List<EmployeeEntity> employeeEntities= employeeRepository.findAll();
        return employeeEntities.stream().map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class)).collect(Collectors.toList());
    }

    public EmployeeDTO createemp(EmployeeDTO inputemp) {
        EmployeeEntity tosaveemployeeentity= modelMapper.map(inputemp, EmployeeEntity.class);
        EmployeeEntity savedemployeeEntity= employeeRepository.save(tosaveemployeeentity);
        return modelMapper.map(savedemployeeEntity, EmployeeDTO.class);

    }

    public EmployeeDTO updateempbyId(Long id, EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity= modelMapper.map(employeeDTO,EmployeeEntity.class);
        employeeEntity.setId(id);
        EmployeeEntity savedemployeeEntity= employeeRepository.save(employeeEntity);
        return modelMapper.map(savedemployeeEntity,EmployeeDTO.class);
    }
}
