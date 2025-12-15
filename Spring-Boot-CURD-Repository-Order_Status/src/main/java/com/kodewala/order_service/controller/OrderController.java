package com.kodewala.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.order_service.entity.OrderEntity;
import com.kodewala.order_service.request.OrderBean;
import com.kodewala.order_service.request.UpdateOrderStatus;
import com.kodewala.order_service.service.OrderServiceImpl;

@RestController
public class OrderController {
	
	@Autowired
	OrderServiceImpl impl;
	
	@PostMapping("placeOrder")
	public String createOrder(@RequestBody OrderBean orderBean) {
		
		OrderEntity result = impl.createOrder(orderBean);
		
		return "Order Placed Successfully.Order Id is: "+ result.getId();
	}

	
	
	
	@PutMapping("updateOrder/{id}/status")
	public String updateStatus(@PathVariable int id , @RequestBody UpdateOrderStatus updateOrderStatus) {
		
		OrderEntity result = impl.updateStatus(id, updateOrderStatus);
		
		
		return "Order status update successfull.... Order id is: "+ result.getId() + "Status = "+ result.getStatus();
	}
	
	
}
