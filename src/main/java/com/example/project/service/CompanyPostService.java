package com.example.project.service;

import com.example.project.repository.CompanyPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyPostService {
    @Autowired
    private CompanyPostRepository repository;
}
