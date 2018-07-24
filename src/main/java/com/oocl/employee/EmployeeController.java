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
    @GetMapping(path="/employee/{employeeId}")
    public Employee findEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.getEmoloyee(employeeId);
        return  employee;
    }
    @DeleteMapping(path="/employee/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId){
       employeeService.deleteEmployee(employeeId);
    }
//    @PutMapping(path="employee/{employeeId}?name={name}")

}