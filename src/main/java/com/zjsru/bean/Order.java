package com.zjsru.bean;

import java.util.List;

public class Order {
	private int id;
	private int oid;
	private int aid;
	private int cid;
	private int o_count;
	private float o_sum;
	private int state;
	private List<Commodity> commoditys;
	private Address address;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCount() {
		return o_count;
	}

	public void setCount(int count) {
		this.o_count = count;
	}

	public float getSum() {
		return o_sum;
	}

	public void setSum(float sum) {
		this.o_sum = sum;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public List<Commodity> getCommoditys() {
		return commoditys;
	}

	public void setCommoditys(List<Commodity> commoditys) {
		this.commoditys = commoditys;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", oid=" + oid + ", aid=" + aid + ", cid=" + cid + ", count=" + o_count + ", sum="
				+ o_sum + ", state=" + state + ", commoditys=" + commoditys + ", address=" + address + "]";
	}
	
}
