package com.example.project.service;

import com.example.project.entity.Admin;
import com.example.project.entity.Detail;
import com.example.project.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;

    // GETSERVICE
    // authentication
    public boolean auth(Admin obj) {
        Admin admin = repository.findById(obj.getId()).orElse(null);
        if(admin == null){
            return false;
        }
        String adminUsername = admin.getUsername();
        String adminPassword = admin.getPass    ();
        if( (adminUsername.compareTo(obj.getUsername()) == 0 ) && ( adminPassword.compareTo(obj.getPass()) == 0 )) {
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

    public Admin getById(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Admin> getAll() {
        return repository.findAll();
    }

    public String deleteAdmin(int id) {
        repository.deleteById(id);
        return "deleted";
    }
}
