package com.kodewala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderId {
	
	@Value("007")
	 int oId;

	 public int getoId() {
		 return oId;
	 }

	 public void setoId(int oId) {
		 this.oId = oId;
	 }
	 
	 
	

}
