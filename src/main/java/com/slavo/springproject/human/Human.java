package com.slavo.springproject.human;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Human {
	
	@Id
	private int hid;
	private String name;
	private String surname;
	
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
