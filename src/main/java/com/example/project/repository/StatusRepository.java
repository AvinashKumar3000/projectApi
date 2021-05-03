package com.example.project.repository;

import com.example.project.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
	Status findByEmpId(int empId);
}
