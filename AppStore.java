package com.pojo;

import java.util.List;

//POJO for JSON Full Data Bind.
public class AppStore {
	
	private int resultCount;
	
	private List<AppResults> results;
	
	public int getResultCount() {
		return resultCount;
	}
	
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	
	public List<AppResults> getResults() {
		return results;
	}
	
	public void setResults(List<AppResults> results) {
		this.results = results;
	}
}
