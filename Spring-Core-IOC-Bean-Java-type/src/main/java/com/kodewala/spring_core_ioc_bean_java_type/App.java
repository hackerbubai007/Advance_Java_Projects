package com.kodewala.spring_core_ioc_bean_java_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Order;
import com.kodewala.bean.SpringConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

	Order order =	(Order) applicationContext.getBean("order");
	
	System.out.println(order.getItemId()+" "+order.getItemName()+" "+order.getStatus()+" to Dipankar");

	}
}
