package com.example.project.service;

import com.example.project.entity.Status;
import com.example.project.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    @Autowired
    private StatusRepository repository;

    public List<Status> getAll(int cid) {
        return repository.findAll();
    }

    public Status updateData(Status status) {
        Status oldStatus = repository.findById(status.getId()).orElse(null);
        if(oldStatus != null) {
            oldStatus = status;
            return repository.save(oldStatus);
        }else{
            return repository.save(status);
        }
    }

}
