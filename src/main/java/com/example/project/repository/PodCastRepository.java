package com.example.project.repository;

import com.example.project.entity.PodCast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PodCastRepository extends JpaRepository<PodCast,Integer> {
}
