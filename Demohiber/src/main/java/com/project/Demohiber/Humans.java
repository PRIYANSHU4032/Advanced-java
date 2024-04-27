package com.project.Demohiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Humans {
	
	@Id
	private int hid;
	private Fullname hname;
	private String address;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Fullname getHname() {
		return hname;
	}
	public void setHname(Fullname hname) {
		this.hname = hname;
	}
	@Override
	public String toString() {
		return "Humans [hid=" + hid + ", hname=" + hname + ", address=" + address + "]";
	}
	
	
}
