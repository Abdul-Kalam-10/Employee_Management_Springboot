package com.techie.crud_management.service;

import com.techie.crud_management.EmployeeTo;
import com.techie.crud_management.model.Employee;
import com.techie.crud_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository ;

    public String createEmployee(EmployeeTo employeeTo){
        try {
            Employee emp = Employee.builder()
                    .empname(employeeTo.getEmpname())
                    .salary(employeeTo.getSalary())
                    .location(employeeTo.getLocation())
                    .build();

            employeeRepository.save(emp);
        }
        catch (Exception e) {
            // TODO: handle exception
        }
        return "Employee Created Successfully";
    }
    public List<Employee> getEmployee(){
        List<Employee> empList = new ArrayList<>();
          try {
               empList = employeeRepository.findAll();

          }catch (Exception e) { }
          return empList;
    }

    public String deleteEmployee(String id) {
        try{
            employeeRepository.deleteById(id);

        } catch(Exception e) { }

        return "Employee Deleted Successfully";
    }

    public String updateEmployee(EmployeeTo emp) {
        try{
            Employee employee =  Employee.builder()
                            .id(emp.getId())
                            .empname(emp.getEmpname())
                            .location(emp.getLocation())
                            .salary(emp.getSalary())
                            .build();
            employeeRepository.save(employee);

        } catch (Exception e){ }
        return "Employee updated Successfully";
    }
}
