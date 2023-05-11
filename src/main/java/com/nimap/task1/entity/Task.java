package com.nimap.task1.entity;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TASKS")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TASK_ID")
	private int id;

	private String name;

	@OneToMany(mappedBy="pk.t", cascade = CascadeType.ALL)
	private Set<UserTask> userTasks = new HashSet<>();

	public Task() {

	}

	public Task(String name) {

		this.name = name;
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

	public Set<UserTask> getUserTasks() {
		return userTasks;
	}

	public void setUserTasks(Set<UserTask> userTasks) {
		this.userTasks = userTasks;
	}

}
