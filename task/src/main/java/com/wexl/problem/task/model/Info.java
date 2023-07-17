package com.wexl.problem.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {
	
	@JsonProperty("seed")
	private String seed;
	
	@JsonProperty("results")
	private int results;
	
	@JsonProperty ("page")
	private int page;
	
	@JsonProperty ("version")
	private String version;

	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}
	public int getResults() {
		return results;
	}
	public void setResults(int results) {
		this.results = results;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	

}
