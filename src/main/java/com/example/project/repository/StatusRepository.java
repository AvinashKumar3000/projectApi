package com.example.project.repository;

import com.example.project.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatusRepository extends JpaRepository<Status, Integer> {
	List<Status> findByEmpId(int empId);
}
