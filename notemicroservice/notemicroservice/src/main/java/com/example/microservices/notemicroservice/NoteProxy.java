package com.example.microservices.notemicroservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="comment-service")
public interface NoteProxy {
	
	@GetMapping("comments/comment/{pid}")
	public List<CommentsDto> findCommentsByPid(@PathVariable int pid);

}
