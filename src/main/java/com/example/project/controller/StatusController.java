package com.example.project.controller;

import com.example.project.entity.Status;
import com.example.project.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StatusController {
    @Autowired
    private StatusService service;
    @GetMapping("status/{cid}")
    public List<Status> listStatusBycId(@PathVariable int cid){
        return service.getAll(cid);
    }
    @PutMapping("status")
    public Status update(@RequestBody Status status){
        return service.updateData(status);
    }
}
