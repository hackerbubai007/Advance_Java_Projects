package com.kodewala.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean("order")
	public Order orderConfiguration() {
		
		Order order= new Order();
		
		order.setItemId(1);
		order.setItemName("Continental GT 650");
		order.setStatus("Delivered");
		return order;
		
	}
	

}
