package com.example.mongo.controller;

import com.example.mongo.dto.EmployeeDTO;
import com.example.mongo.entity.Employee;
import com.example.mongo.services.EmployeeServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Employee4")
public class EmployeeControler {
    @Autowired
    EmployeeServices employeeServices;
    @ResponseBody
    @PostMapping()
    public ResponseEntity<String> addOrUpdateEmployee(@RequestBody EmployeeDTO employeeDTO){
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        Employee employeeCreated=employeeServices.save(employee);
        return new ResponseEntity<String>(employeeCreated.getEmployeeId(),HttpStatus.CREATED);
    }

}
