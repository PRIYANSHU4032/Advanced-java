package com.jaganath.hello;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Student {
	@Id
	private String rollno;
	private String name;
	private String course;
	@OneToMany(mappedBy ="student")
	private List<Books>book = new ArrayList<Books>();
	
	
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", book=" + book + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public List<Books> getBook() {
		return book;
	}
	public void setBook(List<Books> book) {
		this.book = book;
	}
	
}
