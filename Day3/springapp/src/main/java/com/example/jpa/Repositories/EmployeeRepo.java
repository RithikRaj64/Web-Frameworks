package com.example.jpa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.Models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
