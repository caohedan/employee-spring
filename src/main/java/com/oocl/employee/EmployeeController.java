package com.oocl.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path="/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.add(employee);
    }
    @GetMapping(path="/employee")
    public List<Employee> findAllEmployees(){
        return  employeeService.getAllEmployees();
    }

}