package com.kodewala.order_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.order_service.entity.OrderEntity;


@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{
	
	

}
