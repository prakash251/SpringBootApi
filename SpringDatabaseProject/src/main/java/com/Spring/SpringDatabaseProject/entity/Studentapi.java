package com.Spring.SpringDatabaseProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Studentapi
{
    @Id
	int id;
	String name;
	String branch;
	public Studentapi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentapi(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Studentapi [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	
}
