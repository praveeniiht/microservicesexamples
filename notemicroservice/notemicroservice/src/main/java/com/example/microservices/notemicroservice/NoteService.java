package com.example.microservices.notemicroservice;

import com.example.microservices.notemicroservice.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    public List<Note> getAllNotes();
    public Optional<Note> getNoteById(int id);
    
    public List<CommentsDto> getAllCommentsByPostId(int pid);
}
