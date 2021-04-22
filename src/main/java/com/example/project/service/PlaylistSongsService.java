package com.example.project.service;

import com.example.project.entity.PlaylistSongs;
import com.example.project.repository.PlaylistSongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistSongsService {
    @Autowired
    private PlaylistSongsRepository repository;

    public List<PlaylistSongs> byPlaylistId(int plId) {
        return repository.queryPlayListId(plId);
    }
    public PlaylistSongs addSong(PlaylistSongs playlistSongs) {
        return repository.save(playlistSongs);
    }
}
