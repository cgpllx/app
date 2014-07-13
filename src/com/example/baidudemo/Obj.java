package com.example.baidudemo;

import java.util.List;

public class Obj {
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getItem() {
		return item;
	}
	public void setItem(List<String> item) {
		this.item = item;
	}
	public Obj(String category, List<String> item) {
		super();
		this.category = category;
		this.item = item;
	}
	private String category;
	private List<String> item;
	
}
