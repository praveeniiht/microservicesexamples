package com.example.microservices.commentmicroservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {

    @Id
    private int cid;

    @Column(name="pid")
    private int id;

    private String commenter;

    private String comment;

    public Comment(int cid, int id, String commenter, String comment) {
        this.cid = cid;
        this.id = id;
        this.commenter = commenter;
        this.comment = comment;
    }

    public Comment(){

    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCommenter() {
        return commenter;
    }
    public void setCommenter(String commenter) {
        this.commenter = commenter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
