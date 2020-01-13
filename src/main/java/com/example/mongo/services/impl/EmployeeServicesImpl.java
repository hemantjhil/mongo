package com.example.mongo.services.impl;

import com.example.mongo.entity.Employee;
import com.example.mongo.repository.EmployeeRepository;
import com.example.mongo.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServicesImpl implements EmployeeServices {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
}
