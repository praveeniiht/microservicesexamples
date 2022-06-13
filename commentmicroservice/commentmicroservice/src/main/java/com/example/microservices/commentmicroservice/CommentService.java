package com.example.microservices.commentmicroservice;

import java.util.List;

public interface CommentService {

    public List<Comment> getAllComments();
    public List<Comment> getCommentsByPostId(int id);
}
