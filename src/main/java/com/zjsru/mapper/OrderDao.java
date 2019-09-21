package com.zjsru.mapper;

import java.util.List;

import com.zjsru.bean.Order;

public interface OrderDao {
	void insertOrder(Order order);
	void updateOrder(Order order);
	Order selectByOid(int oid);
	List<Order> selectAllOrder();
}
