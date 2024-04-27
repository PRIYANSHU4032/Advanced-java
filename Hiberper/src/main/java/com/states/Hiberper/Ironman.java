package com.states.Hiberper;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ironman {
	private String suit;
	private String feat;
	@Id
	private int sid;
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getFeat() {
		return feat;
	}
	public void setFeat(String feat) {
		this.feat = feat;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Ironman [suit=" + suit + ", feat=" + feat + ", sid=" + sid + "]";
	}
}
