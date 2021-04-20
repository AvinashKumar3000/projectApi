package com.example.project.controller;

import com.example.project.entity.Employee;
import com.example.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    // GET
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return service.getAll();
    }
    // POST
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        service.add(employee);
        return "success";
    }
    @PostMapping("/authentication")
    public String authentication(@RequestBody Employee employee){
        if(service.auth(employee)){
            return "true";
        }
        return "false";
    }
    @PostMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return service.updateDetail(employee);
    }
    @DeleteMapping("/delEmployee/{id}")
    public String delete(@PathVariable int id){
        return service.deleteEmployee(id);
    }
}
