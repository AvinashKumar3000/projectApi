package com.example.project.service;

import com.example.project.entity.Attendance;
import com.example.project.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository repository;
    public List<Attendance> getBYEmpId(int empId){
        return repository.findAllByEmpId(empId);
    }
    public Attendance postAttendance(Attendance attendance){
        return repository.save(attendance);
    }
}
