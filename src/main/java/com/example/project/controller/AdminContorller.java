package com.example.project.controller;

import com.example.project.entity.Admin;
import com.example.project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class AdminContorller {
    @Autowired
    private AdminService service;

    @PostMapping("/admin")
    public Admin create(@RequestBody Admin admin){
        return service.saveDetails(admin);
    }
    @PutMapping("/admin")
    public Admin update(@RequestBody Admin admin){
        return service.updateDetail(admin);
    }
    @GetMapping("/admin/{id}")
    public Admin getAdminById(@PathVariable int id){
        return service.getById(id);
    }
    @PostMapping("authentication")
    public String authentication(@RequestBody Admin admin){
        if(service.auth(admin)){
            return "true";
        }
        return "false";
    }
}
