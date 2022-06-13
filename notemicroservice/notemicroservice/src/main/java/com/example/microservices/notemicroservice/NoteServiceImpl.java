package com.example.microservices.notemicroservice;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteRepository repo;
    
    @Autowired
    NoteProxy proxy;
    
    private Logger logger = LoggerFactory.getLogger(NoteServiceImpl.class);

    @Override
    public List<Note> getAllNotes() {
    	logger.info("note-service-- listing all the notes from the database");
        return repo.findAll();
    }

    @Override
    public Optional<Note> getNoteById(int id) {
    	logger.info("note-service-- seach and retreive the note based on id");
        return repo.findById(id);
    }

	@Override
	public List<CommentsDto> getAllCommentsByPostId(int pid) {
		// TODO Auto-generated method stub
		logger.info("note-service-- connect to comment-service and get the comments based on the given id");
		return proxy.findCommentsByPid(pid);
	}
}
