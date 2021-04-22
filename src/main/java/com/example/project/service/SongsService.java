package com.example.project.service;

import com.example.project.entity.Songs;
import com.example.project.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsService {
    @Autowired
    private SongsRepository repository;
    // SAVE
    public void saveSong(Songs song){
        repository.save(song);
    }
    // GET
    public List<Songs> getAllSongs(){
        return repository.findAll();
    }

    public Songs getSong(int id) {
        return repository.findById(id).orElse(null);
    }
}

