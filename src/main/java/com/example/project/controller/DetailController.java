package com.example.project.controller;

import com.example.project.entity.Detail;
import com.example.project.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Detail")
public class DetailController {
    @Autowired
    private DetailService service;

    @GetMapping("/gretting")
    public String getAllDetails() {
        return "How are you, sir.";
    }
    // GET methods
    @GetMapping("/findAllDetails")
    public List<Detail> findAllDetails() {
        return service.getAllDetails();
    }

    @GetMapping("/findDetailsById/{id}")
    public Detail findDetailsById(@PathVariable int id) {
        return service.getDetailsById(id);
    }

    @GetMapping("/searchByTitle/{title}")
    public Detail searchDetailByTitle(@PathVariable String title){
        return service.searchByTitle(title);
    }
    // POST method
    @PostMapping("/addDetails")
    public Detail addDetails(@RequestBody Detail detail) {
        return service.saveDetails(detail);
    }

    @PutMapping("/updateDetails")
    public Detail updateDetails(@RequestBody Detail detail) {
        return service.updateDetail(detail);
    }

    @DeleteMapping("/deleteDetails/{id}")
    public String deleteDetails(@PathVariable int id){
        service.deleteDetail(id);
        return "The content deleted successfully";
    }
}
