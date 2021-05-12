package com.example.project.controller;

import com.example.project.entity.SongHistory;
import com.example.project.repository.SongHistoryRepo;
import com.example.project.service.SongHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SongHistoryController {
    @Autowired
    private SongHistoryService service;
    @GetMapping("/history")
    public List<SongHistory> getAllHistory() {
        return service.getAll();
    }
    @PostMapping("/history")
    public SongHistory save(@RequestBody SongHistory songHistory) {
        return service.set(songHistory);
    }
}
