package com.project.Demohiber;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private String rollno;
	private String sname;
	private String marks;
	//@OneToOne
	//private Laptop laptop;
	@ManyToMany(mappedBy = "student")
	private List<Laptop> lap = new ArrayList<Laptop>();
	
	
	
	
	
	
	public List<Laptop> getLap() {
		return lap;
	}
	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
}
