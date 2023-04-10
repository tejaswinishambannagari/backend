package com.exam.backend.entity;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int  id;
	//@OneToOne(targetEntity=Exam.class, cascade = CascadeType.ALL)
	private int examid;
	//@ManyToOne(targetEntity=Candidate.class, cascade = CascadeType.ALL)
	private int candidateid;
	
	@NotNull(message = "should not be empty")
	@Column
	@JsonFormat(pattern="yyyy-MM-dd")
	private String bookingdate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public int getCandidateid() {
		return candidateid;
	}
	public void setCandidateid(int candidateid) {
		this.candidateid = candidateid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	
	public Booking() {
		super();
		this.id = id;
		this.examid = examid;
		this.candidateid = candidateid;
		this.bookingdate = bookingdate;
	}

	
	@Override
	public String toString() {
		return "ExamBooking [id=" + id + ", examid=" + examid + ", candidateid=" + candidateid
				+ ", bookingdate=" + bookingdate + "]";
	}
	
	

}



