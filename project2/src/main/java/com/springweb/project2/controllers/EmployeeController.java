package com.springweb.project2.controllers;

import com.springweb.project2.dto.EmployeeDTO;
import com.springweb.project2.entities.EmployeeEntity;
import com.springweb.project2.repositories.EmployeeRepository;
import com.springweb.project2.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/emp")
public class EmployeeController {

//    @GetMapping(path="/getmessage")
//    public String getmessage(){
//        return "Misty Jangid";
//    }

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{empId}")
    public EmployeeDTO getemp(@PathVariable(name="empId") Long id){
        return employeeService.getemp(id);
    }
    @GetMapping
    public List<EmployeeDTO> getallemp(@RequestParam(required = false) Integer age, @RequestParam(required = false) String sortBy ){
        return employeeService.getallemp();
    }
//    @PostMapping
//    public String getmsg(){
//        return "misty jangid hello from post";
//    }
    @PostMapping
    public EmployeeDTO createemp(@RequestBody @Valid EmployeeDTO inputemp){
        return employeeService.createemp(inputemp);
    }
    @PutMapping(path = "/{empid}")
    public EmployeeDTO updateempbyId(@RequestBody EmployeeDTO employeeDTO,@PathVariable(name="empid") Long id){
        return employeeService.updateempbyId(id,employeeDTO);
    }

}
