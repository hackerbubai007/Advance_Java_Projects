package com.kodewala.zepto.service;

import org.springframework.stereotype.Service;

import com.kodewala.zepto.bean.PaymentBean;

@Service
public interface IPaymentService {

	String pay(PaymentBean paymentBean);

}
