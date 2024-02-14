package com.example.employee;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.employee.EmployeeService;
import com.example.employee.Employee;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }
    @PostMapping("/employees")
    public Employee addEmployee(@PathVariable("employeeId") int employeeId,@RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }
    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") int employeeId int employeeId,@RequestBody Employee employee) {
        return employeeService.updateEmployee(employeeId, employee);
    }
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}