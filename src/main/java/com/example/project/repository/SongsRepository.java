package com.example.project.repository;

import com.example.project.entity.Songs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongsRepository extends JpaRepository<Songs, Integer> {
}
