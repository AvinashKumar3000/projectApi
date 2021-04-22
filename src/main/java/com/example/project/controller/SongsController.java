package com.example.project.controller;

import com.example.project.entity.Songs;
import com.example.project.service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Songs")
public class SongsController {
    @Autowired
    private SongsService service;

    @GetMapping("/getSongs")
    public List<Songs> getSongs(){
        return service.getAllSongs();
    }
    @GetMapping("/getSongs/{id}")
    public Songs getSong(@PathVariable int id) {
        return service.getSong(id);
    }

    @PostMapping("/saveSong")
    public String saveSong(@RequestBody Songs song){
        service.saveSong(song);
        return "Saved successfully";
    }
}
