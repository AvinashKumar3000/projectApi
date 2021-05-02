package com.example.project.service;

import com.example.project.entity.Playlist;
import com.example.project.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository repository;

    public List<Playlist> playlistByEmpId(int empId) {
        return repository.findAllByEmployeeId(empId);
    }

    public String addPlaylist(Playlist playlist) {
        repository.save(playlist);
        return "created";
    }

    public void delPlaylist(int id) {
        repository.deleteById(id);
    }
}
