package com.kodewala.spring_core_bean_annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.OrderId;

public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

		OrderId orderId = applicationContext.getBean(OrderId.class);
		System.out.println(orderId.getoId());

	}
}
