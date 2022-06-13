package com.example.microservices.commentmicroservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findAllById(int id);
}
