package com.example.project.repository;

import com.example.project.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail,Integer> {
    Detail findByTitle(String title);
}
