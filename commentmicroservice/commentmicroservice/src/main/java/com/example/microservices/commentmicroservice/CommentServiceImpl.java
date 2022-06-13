package com.example.microservices.commentmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    CommentRepository repo;
    @Override
    public List<Comment> getAllComments() {
        return repo.findAll();
    }

    @Override
    public List<Comment> getCommentsByPostId(int id) {
        return repo.findAllById(id);
    }
}
