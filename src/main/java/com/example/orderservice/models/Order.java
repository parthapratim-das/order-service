package com.example.orderservice.models;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
	
	private String name;
	private long id;
	private double price;
	private String desc;

}
