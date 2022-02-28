package com.example.orderservice.services;

import java.util.List;

import com.example.orderservice.models.Order;

public interface OrderService {
	
	List<Order> getOrders();

}
