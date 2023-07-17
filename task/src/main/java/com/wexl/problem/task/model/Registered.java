package com.wexl.problem.task.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Registered {
	
	@Column(insertable = false, updatable = false)
	private LocalDate date;
	@Column (insertable = false, updatable = false)
	private int age;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
