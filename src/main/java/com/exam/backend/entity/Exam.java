package com.exam.backend.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Exam {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int examid;
	private String examname;
	private String examsubject;
	private String examduration;
	private int noofquestions;
	private String examdate;
	private double price;
	
	
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public String getExamsubject() {
		return examsubject;
	}
	public void setExamsubject(String examsubject) {
		this.examsubject = examsubject;
	}
	public String getExamduration() {
		return examduration;
	}
	public void setExamduration(String examduration) {
		this.examduration = examduration;
	}
	public int getNoofquestions() {
		return noofquestions;
	}
	public void setNoofquestions(int noofquestions) {
		this.noofquestions = noofquestions;
	}
	public String getExamdate() {
		return examdate;
	}
	public void setExamdate(String examdate) {
		this.examdate = examdate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Exam(int examid, String examname, String examsubject, String examduration, int noofquestions,
			String examdate, double price) {
		super();
		this.examid = examid;
		this.examname = examname;
		this.examsubject = examsubject;
		this.examduration = examduration;
		this.noofquestions = noofquestions;
		this.examdate = examdate;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", examname=" + examname + ", examsubject=" + examsubject + ", examduration="
				+ examduration + ", noofquestions=" + noofquestions + ", examdate=" + examdate + ", price=" + price
				+ "]";
	}
	
	
	
	
	

}