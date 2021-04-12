package com.example.project.service;

import com.example.project.repository.PodCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PodCastService {
    @Autowired
    private PodCastRepository repository;
}
