package com.example.project.repository;

import com.example.project.entity.PlaylistSongs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistSongsRepository extends JpaRepository<PlaylistSongs, Integer> {
}
