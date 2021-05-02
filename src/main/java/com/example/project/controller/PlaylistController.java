package com.example.project.controller;

import com.example.project.entity.Playlist;
import com.example.project.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PlaylistController {
    @Autowired
    private PlaylistService service;
    @GetMapping("playlist/{empId}")
    public List<Playlist> playlistByEmpId(@PathVariable int empId){
        return service.playlistByEmpId(empId);
    }
    @PostMapping("playlist")
    public String addPlaylist(@RequestBody Playlist playlist){
        return service.addPlaylist(playlist);
    }
    @DeleteMapping("playlist")
    public String delPlaylist(@PathVariable int id) {
        service.delPlaylist(id);
        return "deleted successfully";
    }
}
