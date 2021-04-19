package com.example.project.controller;

import com.example.project.entity.Post;
import com.example.project.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class PostController {
    @Autowired
    private PostService service;
    @GetMapping("post")
    public Post get(){
        return service.getPost();
    }
    @PostMapping("post")
    public Post set(@RequestBody Post post){
        return service.setPost(post);
    }
    @PutMapping("post")
    public Post update(@RequestBody Post post){ return service.updatePost(post);}
}
