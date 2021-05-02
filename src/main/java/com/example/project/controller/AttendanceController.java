package com.example.project.controller;

import com.example.project.entity.Attendance;
import com.example.project.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AttendanceController {
    @Autowired
    private AttendanceService service;
    @GetMapping("attendance/{empId}")
    public List<Attendance> get(@PathVariable int empId) {
        return service.getBYEmpId(empId);
    }
    @PostMapping("attendance")
    public Attendance update(@RequestBody Attendance attendance){
        return service.postAttendance(attendance);
    }
}
