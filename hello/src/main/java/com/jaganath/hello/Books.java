package com.jaganath.hello;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Books {
	@Id
	private String bid;
	private String bname;
	private String category;
	private String author;
	@ManyToOne
	private Student student;
	
	
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", category=" + category + ", author=" + author + ", student="
				+ student + "]";
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
