package com.kodewala.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.payment.entity.AccountCreateEntity;
import com.kodewala.payment.requet.AccountCreateRequest;
import com.kodewala.payment.requet.PaymentRequest;
import com.kodewala.payment.service.IPaymentService;

@RestController
public class PaymentController {

	@Autowired
	IPaymentService iPaymentService;

	@PostMapping("createAccout")
	public AccountCreateEntity createAccount(@RequestBody AccountCreateRequest accountCreateRequest) {

		AccountCreateEntity result = iPaymentService.createAccount(accountCreateRequest);

		return result;

	}

	@PostMapping("moneyTransfer")
	public AccountCreateEntity fundTransfer(@RequestBody PaymentRequest request) {

		AccountCreateEntity result = iPaymentService.doPayment(request);

		return result;
	}

}
