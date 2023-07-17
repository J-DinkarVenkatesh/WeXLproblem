package com.wexl.problem.task.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Timezone {
	
	private String offset;
	private String description;
	
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
