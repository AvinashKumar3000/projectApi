package com.example.project.service;

import com.example.project.entity.Post;
import com.example.project.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post getPost() {
        return repository.findById(1).orElse(null);
    }

    public Post setPost(Post post) {
        return repository.save(post);
    }

    public Post updatePost(Post post) {
        Post old = repository.findById(post.getId()).orElse(null);
        old = post;
        return repository.save(old);
    }
}
