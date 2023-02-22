package com.example.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.Models.Employee;
import com.example.jpa.Service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public boolean saveEmployee(@RequestBody Employee employee) {
        return (apiService.saveEmployee(employee) != null);
    }

    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return apiService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return apiService.getEmployeeById(id);
    }
}
