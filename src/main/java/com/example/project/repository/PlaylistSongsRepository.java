package com.example.project.repository;

import com.example.project.entity.PlaylistSongs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaylistSongsRepository extends JpaRepository<PlaylistSongs, Integer> {

    List<PlaylistSongs> findAllByPlaylistId(int plId);
}
