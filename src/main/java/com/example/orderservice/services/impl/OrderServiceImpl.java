package com.example.orderservice.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.orderservice.dao.OrderDAO;
import com.example.orderservice.models.Order;
import com.example.orderservice.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		OrderDAO orders = new OrderDAO();
		return orders.getOrders();
	}

}
