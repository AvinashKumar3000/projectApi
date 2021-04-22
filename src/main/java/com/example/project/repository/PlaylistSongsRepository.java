package com.example.project.repository;

import com.example.project.entity.PlaylistSongs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaylistSongsRepository extends JpaRepository<PlaylistSongs, Integer> {
    @Query(name = "SELECT * FROM playlistsongs where playlist_id = plId",
    nativeQuery = true)
    List<PlaylistSongs> queryPlayListId(@Param("plId") int plId);
}
