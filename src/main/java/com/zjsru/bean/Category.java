package com.zjsru.bean;

import java.util.List;

public class Category {
	private int id;
	private int ca_id;
	private String ca_name;
	private List<Commodity> commoditys;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCa_id() {
		return ca_id;
	}
	public void setCa_id(int ca_id) {
		this.ca_id = ca_id;
	}
	public String getCa_name() {
		return ca_name;
	}
	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}
	public List<Commodity> getCommoditys() {
		return commoditys;
	}
	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", ca_id=" + ca_id + ", ca_name=" + ca_name + ", commoditys=" + commoditys + "]";
	}
	
}
