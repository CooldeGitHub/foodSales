package com.zjsru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjsru.bean.Order;
import com.zjsru.mapper.OrderDao;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;

	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.insertOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.updateOrder(order);
	}

	@Override
	public Order findByOid(int oid) {
		// TODO Auto-generated method stub
		Order order = orderDao.selectByOid(oid);
		return order;
	}

	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		List<Order> orders = orderDao.selectAllOrder();
		return orders;
	}

}
