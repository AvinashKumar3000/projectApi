package com.example.project.service;

import com.example.project.entity.SongHistory;
import com.example.project.repository.SongHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongHistoryService {
    @Autowired
    private SongHistoryRepo repo;
    public List<SongHistory> getAll() {
        return repo.findAll();
    }
    public SongHistory set(SongHistory songHistory) {
        return repo.save(songHistory);
    }
}
