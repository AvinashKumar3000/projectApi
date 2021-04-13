package com.example.project.controller;

import com.example.project.entity.Admin;
import com.example.project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("admin")
public class AdminContorller {
    @Autowired
    private AdminService service;

    @PostMapping("createAdmin")
    public String create(@RequestBody Admin admin){
        service.saveDetails(admin);
        return "sucess";
    }

    @PostMapping("authentication")
    public String authentication(@RequestBody Admin admin){
        if(service.auth(admin)){
            return "true";
        }
        return "false";
    }
}
