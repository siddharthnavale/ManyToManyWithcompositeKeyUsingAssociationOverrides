package com.nimap.task1.entity;

import java.io.Serializable;


import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UserTaskId implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Task t;
	
	@ManyToOne
	private User u;

	
	
	public UserTaskId() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserTaskId(Task t, User u) {
		super();
		this.t = t;
		this.u = u;
	}



	public Task getT() {
		return t;
	}



	public void setT(Task t) {
		this.t = t;
	}



	public User getU() {
		return u;
	}



	public void setU(User u) {
		this.u = u;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
