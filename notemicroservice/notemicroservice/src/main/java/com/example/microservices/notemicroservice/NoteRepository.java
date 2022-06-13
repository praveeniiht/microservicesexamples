package com.example.microservices.notemicroservice;


import com.example.microservices.notemicroservice.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface NoteRepository extends JpaRepository<Note,Integer> {
	
}
