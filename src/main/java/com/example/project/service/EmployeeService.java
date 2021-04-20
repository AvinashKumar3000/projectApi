package com.example.project.service;

import com.example.project.entity.Admin;
import com.example.project.entity.Employee;
import com.example.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAll(){
        return repository.findAll();
    }

    public Employee add(Employee employee){
        return repository.save(employee);
    }
    // UPDATE
    public Employee updateDetail(Employee employee) {
        Employee existingDetail = repository.findById(employee.getId()).orElse(null);
        existingDetail = employee;
        return repository.save(existingDetail);
    }
    public boolean auth(Employee obj) {
        Employee employee = repository.findById(obj.getId()).orElse(null);
        if(employee == null){
            return false;
        }
        String employeeUsername = employee.getUsername();
        String employeePassword = employee.getPassword();
        if( (employeeUsername.compareTo(obj.getUsername()) == 0 ) && ( employeePassword.compareTo(obj.getPassword()) == 0 )) {
            return true;
        }
        return false;
    }
    public String deleteEmployee(int id){
        repository.deleteById(id);
        return "deleted";
    }
}
