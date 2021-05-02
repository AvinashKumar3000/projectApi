package com.example.project.controller;

import com.example.project.entity.PlaylistSongs;
import com.example.project.service.PlaylistSongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PlaylistSongsController {
    @Autowired
    private PlaylistSongsService service;
    @GetMapping("playlistsongs/{plId}")
    public List<PlaylistSongs> playlistSongs(@PathVariable int plId) {
        return service.byPlaylistId(plId);
    }
    @PostMapping("playlistsongs")
    public PlaylistSongs addSong(@RequestBody PlaylistSongs playlistSongs){
        return service.addSong(playlistSongs);
    }
}
