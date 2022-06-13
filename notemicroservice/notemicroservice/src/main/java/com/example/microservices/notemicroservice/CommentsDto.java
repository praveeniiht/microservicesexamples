package com.example.microservices.notemicroservice;

import javax.persistence.Column;
import javax.persistence.Id;

public class CommentsDto {
	
	 
	    private int cid;

	   
	    private int id;

	    private String commenter;

	    private String comment;

	    public CommentsDto(int cid, int id, String commenter, String comment) {
	        this.cid = cid;
	        this.id = id;
	        this.commenter = commenter;
	        this.comment = comment;
	    }

	    public CommentsDto(){

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
