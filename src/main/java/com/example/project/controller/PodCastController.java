package com.example.project.controller;

import com.example.project.entity.PodCast;
import com.example.project.service.PodCastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class PodCastController {
    @Autowired
    private PodCastService service;
    @GetMapping("/podcast")
    public PodCast get(){
        return service.getPodCast();
    }
    @PostMapping("/podcast")
    public PodCast set(@RequestBody PodCast podCast){
        return service.setPodCast(podCast);
    }
}
