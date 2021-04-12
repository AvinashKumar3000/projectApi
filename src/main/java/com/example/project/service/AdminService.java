package com.example.project.service;

import com.example.project.entity.Admin;
import com.example.project.entity.Detail;
import com.example.project.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;

    // GETSERVICE
    // authentication
    public boolean auth(int adminId,String username, String password) {
        Admin admin = repository.findById(adminId).orElse(null);
        String adminUsername = admin.getUsername();
        String adminPassword = admin.getPassword();
        if( (adminUsername.compareTo(username) == 0 ) && ( adminPassword.compareTo(password) == 0 )) {
            return true;
        }
        return false;
    }

    // POST method
    public Admin saveDetails(Admin admin) {
        return repository.save(admin);
    }

    // UPDATE
    public Admin updateDetail(Admin newDetail) {
        Admin existingDetail = repository.findById(newDetail.getId()).orElse(null);
        existingDetail = newDetail;
        return repository.save(existingDetail);
    }
}
