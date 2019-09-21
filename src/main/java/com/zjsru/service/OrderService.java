package com.zjsru.service;

import java.util.List;

import com.zjsru.bean.Order;

public interface OrderService {
	void addOrder(Order order);
	void updateOrder(Order order);
	Order findByOid(int oid);
	List<Order> findAllOrder();
}
