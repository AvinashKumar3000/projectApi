package com.example.project.service;

import com.example.project.entity.Detail;
import com.example.project.repository.DetailRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DetailService {
    @Autowired
    private DetailRepository repository;
    // POST method
    public Detail saveDetails(Detail details) {
        return repository.save(details);
    }

    // GET method
    public List<Detail> getAllDetails() {
        return repository.findAll();
    }

    public Detail getDetailsById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Detail searchByTitle(String title){
        return repository.findByTitle(title);
    }

    // UPDATE
    public Detail updateDetail(Detail newDetail) {
        Detail existingDetail = repository.findById(newDetail.getId()).orElse(null);
        existingDetail = newDetail;
        return repository.save(existingDetail);
    }

    // DELETE
    public void deleteDetail(int id){
        repository.deleteById(id);
    }
}
