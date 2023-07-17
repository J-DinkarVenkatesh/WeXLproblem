package com.wexl.problem.task.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {

	@JsonProperty("results")
	private List<User> results;
	
	@JsonProperty("info")
	private Info info;

	public List<User> getResults() {
		return results;
	}

	public void setResults(List<User> results) {
		this.results = results;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
	
	
	
}
