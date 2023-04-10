package com.exam.backend.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Candidate {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int candidateid;
	private String name;
	private String email;
	private String password;
	private Long mobileno;
	private String qualification;
	
	
	public int getCandidateid() {
		return candidateid;
	}
	public void setCandidateid(int candidateid) {
		this.candidateid = candidateid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Candidate(int candidateid, String name, String email, String password, Long mobileno, String qualification) {
		super();
		this.candidateid = candidateid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Candidate [candidateid=" + candidateid + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobileno=" + mobileno + ", qualification=" + qualification + "]";
	}
	
	
	
}