package com.example.project.repository;

import com.example.project.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
    @Query(name = "SELECT * FROM playlist where employee_id = empId",
    nativeQuery = true)
    List<Playlist> byEmployeeQuery(@Param("empId") int empId);
}
