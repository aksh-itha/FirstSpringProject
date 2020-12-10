package com.springbootsqlproject.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class Student {
	@Id
	private int id;
	private String name;
	private String branch;
	private String emailid;
	private int phnno;
	public Student() {
		
	}
	public Student(String name, int id, String branch, String emailid, int phnno) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.emailid = emailid;
		this.phnno = phnno;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getPhnno() {
		return phnno;
	}
	public void setPhnno(int phnno) {
		this.phnno = phnno;
	}

	
}
