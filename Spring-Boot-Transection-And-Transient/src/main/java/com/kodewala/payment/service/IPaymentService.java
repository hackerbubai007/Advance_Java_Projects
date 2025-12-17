package com.kodewala.payment.service;

import org.springframework.stereotype.Service;

import com.kodewala.payment.entity.AccountCreateEntity;
import com.kodewala.payment.requet.AccountCreateRequest;
import com.kodewala.payment.requet.PaymentRequest;

@Service
public interface IPaymentService {

	AccountCreateEntity createAccount(AccountCreateRequest accountCreateRequest);

	AccountCreateEntity doPayment(PaymentRequest paymentRequest);

}
