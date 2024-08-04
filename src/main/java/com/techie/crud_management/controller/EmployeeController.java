package com.techie.crud_management.controller;

import com.techie.crud_management.EmployeeTo;
import com.techie.crud_management.model.Employee;
import com.techie.crud_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody EmployeeTo emp){
        return employeeService.createEmployee(emp);

    }
    @GetMapping("/get/employee")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();

    }
    @GetMapping("/delete/employee")
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployee(@RequestParam String id){
        return employeeService.deleteEmployee(id);

    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public String updateEmployee(@RequestBody EmployeeTo emp){
        return employeeService.updateEmployee(emp);

    }
}
