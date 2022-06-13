package com.example.microservices.notemicroservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Note{
    @Id
    @Column(name="pid")
    private int id;
   @Column
    private String author;
    @Column
   private String description;

    @Column
    private String title;

   public Note(){

   }
    public Note(int id, String author, String description, String title) {
        this.id=id;
        this.author = author;
        this.description = description;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setNoteId(int noteId) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}