package com.example.orderservice.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.orderservice.models.Order;

public class OrderDAO {
	
	
	public List<Order> getOrders(){
		List<Order> orders = new ArrayList<>();
		
		Order o = new Order("Flipkart", 112, 29.30, "Flipkart order");
		orders.add(o);
		o = new Order("Amazon", 114, 67.70, "Amazon order");
		orders.add(o);
		o = new Order("Bigbasket", 117, 65.80, "Bigbasket order");
		orders.add(o);
		o = new Order("Myntra", 223, 68.45, "Myntra order");
		orders.add(o);
		return orders;
				
		
	}

}
