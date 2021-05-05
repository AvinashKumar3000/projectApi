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

    public List<Status> getAll() {
        return repository.findAll();
    }

    public Status updateData(Status status) {
       List<Status> arr = repository.findByEmpId(status.getEmpId());
        if(arr.size() != 0) {
            Status oldStatus = arr.get(0);
            oldStatus = status;
            return repository.save(oldStatus);
        }else{
            return repository.save(status);
        }
    }

}
