package com.example.project.service;

import com.example.project.repository.PlaylistSongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistSongsService {
    @Autowired
    private PlaylistSongsRepository repository;
}
