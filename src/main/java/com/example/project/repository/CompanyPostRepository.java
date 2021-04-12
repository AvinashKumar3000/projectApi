package com.example.project.repository;

import com.example.project.entity.CompanyPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyPostRepository extends JpaRepository<CompanyPost, Integer> {
}
