package com.zjsru.bean;

import java.util.List;

public class ShoppingCart {
	private int id;
	private int cid;
	private String cname;
	private int oid;
	private int count;
	private float price;
	private List<Commodity> commoditys;
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
	public int getUid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public List<Commodity> getCommoditys() {
		return commoditys;
	}
	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}
	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", cid=" + cid + ", cname=" + cname + ", oid=" + oid + ", count=" + count
				+ ", price=" + price + ", commoditys=" + commoditys + "]";
	}
	
}
