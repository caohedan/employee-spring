package com.oocl.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
    private Map<Integer,Employee> employees ;

    public EmployeeService(List<Employee> employees) {
        this.employees = new HashMap<>();
    }

    public Employee add(Employee employee){
        employees.put(employee.getId(),employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employeesList = new ArrayList<>();
        for (Integer key : employees.keySet()) {
            employeesList.add (employees.get(key));
        }
        return  employeesList;
    }

    public Employee getEmoloyee(int id) {
        return employees.get(id);
    }
}
