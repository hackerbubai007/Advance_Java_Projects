package com.kodewala.order_service.service;

import org.springframework.stereotype.Service;

import com.kodewala.order_service.entity.OrderEntity;
import com.kodewala.order_service.request.OrderBean;
import com.kodewala.order_service.request.UpdateOrderStatus;

@Service
public interface IOrderService {
	
	public OrderEntity createOrder(OrderBean orderBean);
	
	
	public OrderEntity updateStatus(int id,UpdateOrderStatus orderStatus);

}
