package com.example.project.repository;

import com.example.project.entity.SongHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongHistoryRepo extends JpaRepository<SongHistory,Integer> {
}
