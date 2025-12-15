package com.kodewala.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.order_service.entity.OrderEntity;
import com.kodewala.order_service.exception.handler.InvalidIdException;
import com.kodewala.order_service.repositories.OrderRepo;
import com.kodewala.order_service.request.OrderBean;
import com.kodewala.order_service.request.UpdateOrderStatus;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	OrderRepo orderRepo;

	@Override
	public OrderEntity createOrder(OrderBean orderBean) {

		OrderEntity orderEntity = new OrderEntity();

		orderEntity.setItemName(orderBean.getItemName());
		orderEntity.setItemDesc(orderBean.getItemDesc());
		orderEntity.setPrice(orderBean.getPrice());
		orderEntity.setStatus(orderBean.getStatus());

		OrderEntity result = orderRepo.save(orderEntity);

		return result;
	}

	@Override
	public OrderEntity updateStatus(int id, UpdateOrderStatus orderStatus) {
		try {
			OrderEntity result = orderRepo.findById(id).get();
			result.setStatus(orderStatus.getStatus());

			OrderEntity newResult = orderRepo.save(result);
			return newResult;
		} catch (Exception ex) {
			throw new InvalidIdException("Order not Found with this Id= "+id);
		}

	}

}
