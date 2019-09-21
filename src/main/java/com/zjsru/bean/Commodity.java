package com.zjsru.bean;

public class Commodity {
	private int id;
	private int cid;
	private String cname;
	private float price;
	private int ca_id;
	private int da_id;
	private int c_count;
	private int min_count;
	private Category category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCa_id() {
		return ca_id;
	}
	public void setCa_id(int ca_id) {
		this.ca_id = ca_id;
	}
	public int getDa_id() {
		return da_id;
	}
	public void setDa_id(int da_id) {
		this.da_id = da_id;
	}
	public int getC_count() {
		return c_count;
	}
	public void setC_count(int c_count) {
		this.c_count = c_count;
	}
	public int getMin_count() {
		return min_count;
	}
	public void setMin_count(int min_count) {
		this.min_count = min_count;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Commodity [id=" + id + ", cid=" + cid + ", cname=" + cname + ", price=" + price + ", ca_id=" + ca_id
				+ ", da_id=" + da_id + ", c_count=" + c_count + ", min_count=" + min_count + ", category=" + category
				+ "]";
	}
	
}
