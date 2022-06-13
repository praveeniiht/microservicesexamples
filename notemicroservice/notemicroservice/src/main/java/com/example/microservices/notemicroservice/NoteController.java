package com.example.microservices.notemicroservice;


import java.util.ArrayList;
import io.github.resilience4j.retry.annotation.Retry;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    NoteService service;

    @GetMapping("/test")
    public String test(){
        return "Hello, its working....";
    }

    @GetMapping("/all")
    public List<Note> getAllNotes(){

        return service.getAllNotes();
    }

    @GetMapping("/postid/{id}")
    public Optional<Note> getNotesById(@PathVariable("id") Integer id){
        return service.getNoteById(id);
    }
    
    
    @Retry(fallbackMethod="dummyComments", name = "default")
    @GetMapping("/comments/{pid}")
    public List<CommentsDto> getComments(@PathVariable("pid") Integer pid){
    	return service.getAllCommentsByPostId(pid);
    }
    
    public List<CommentsDto> dummyComments(Exception e){
    	List<CommentsDto> data = new ArrayList<>();
    	data.add(new CommentsDto(5001,6001,"temp1", "comment1"));
    	data.add(new CommentsDto(5002,6002,"temp2", "comment2"));
    	data.add(new CommentsDto(5003,6003,"temp3", "comment3"));
    	return data;
    }
 }
