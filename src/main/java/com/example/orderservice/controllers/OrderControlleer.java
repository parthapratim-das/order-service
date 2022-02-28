package com.example.orderservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.models.Order;
import com.example.orderservice.services.OrderService;

@RestController
public class OrderControlleer {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrders(){
		return ResponseEntity.ok(orderService.getOrders());
	}

}
