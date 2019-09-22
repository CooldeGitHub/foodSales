package com.zjsru.mapper;

import java.util.List;

import com.zjsru.bean.Order;
import com.zjsru.bean.ShoppingCart;

public interface OrderDao {
	int insertOrder(Order order);
	void updateOrder(Order order);
	Order selectByOid(int oid);
	List<Order> selectAllOrder();
	void insertShopCart(ShoppingCart shoppingCart);
}
