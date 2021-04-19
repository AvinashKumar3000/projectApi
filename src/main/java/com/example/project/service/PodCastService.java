package com.example.project.service;

import com.example.project.entity.PodCast;
import com.example.project.repository.PodCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PodCastService {
    @Autowired
    private PodCastRepository repository;
    // get
    public PodCast getPodCast(){
        return repository.findById(1).orElse(null);
    }
    // post
    public PodCast setPodCast(PodCast podCast) {
        return repository.save(podCast);
    }

    public PodCast updatePodCast(PodCast podCast) {
        PodCast old = repository.findById(podCast.getId()).orElse(null);
        old = podCast;
        return repository.save(old);
    }
}
