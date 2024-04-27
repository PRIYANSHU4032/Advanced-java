package com.hql.Demohql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Deadpool {
	private String name;
	@Id
	private String did;
	private String weapons;
	private String weakness;
	
	
	@Override
	public String toString() {
		return "Deadpool [name=" + name + ", did=" + did + ", weapons=" + weapons + ", weakness=" + weakness + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getWeapons() {
		return weapons;
	}
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	public String getWeakness() {
		return weakness;
	}
	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	

}
