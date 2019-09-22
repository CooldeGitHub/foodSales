package com.zjsru.service;

import java.util.List;

import com.zjsru.bean.Order;
import com.zjsru.bean.ShoppingCart;

public interface OrderService {
	int addOrder(Order order);
	void updateOrder(Order order);
	Order findByOid(int oid);
	List<Order> findAllOrder();
	void addShopCart(ShoppingCart shoppingCart);
}
