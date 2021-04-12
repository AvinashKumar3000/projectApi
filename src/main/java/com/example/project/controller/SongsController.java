package com.example.project.controller;

import com.example.project.entity.Songs;
import com.example.project.service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Songs")
public class SongsController {
    @Autowired
    private SongsService service;

    @GetMapping("/getSongs")
    public List<Songs> getSongs(){
        return service.getAllSongs();
    }

    @PostMapping("/saveSong")
    public String saveSong(@RequestBody Songs song){
        service.saveSong(song);
        return "Saved successfully";
    }
}
