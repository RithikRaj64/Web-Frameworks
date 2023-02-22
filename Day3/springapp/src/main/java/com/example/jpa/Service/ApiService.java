package com.example.jpa.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.Models.Employee;
import com.example.jpa.Repositories.EmployeeRepo;

@Service
public class ApiService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

}
