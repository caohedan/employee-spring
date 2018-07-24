package com.oocl.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees ;

    public EmployeeService(List<Employee> employees) {
        this.employees = new ArrayList<>();
    }

    public Employee add(Employee employee){
        employees.add(employee);
        return employee;
    }

}
