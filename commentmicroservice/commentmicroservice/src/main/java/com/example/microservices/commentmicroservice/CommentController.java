package com.example.microservices.commentmicroservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Value("${server.port}")
	String port;

    @Autowired
    CommentService service;
    
    @GetMapping("/port")
    public String ports() {
    	return port;
    }

    @GetMapping("/all")
    public List<Comment> getAllComments(){
        return service.getAllComments();
    }

    @GetMapping("/comment/{pid}")
    public List<Comment> findCommentByPid(@PathVariable("pid") Integer pid){
        return service.getCommentsByPostId(pid);
    }
}
