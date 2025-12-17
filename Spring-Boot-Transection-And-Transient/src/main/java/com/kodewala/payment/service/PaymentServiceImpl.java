package com.kodewala.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.payment.entity.AccountCreateEntity;
import com.kodewala.payment.exception.AccountNotFound;
import com.kodewala.payment.exception.DeActivateException;
import com.kodewala.payment.exception.InsufficientBalance;
import com.kodewala.payment.repositories.PaymentRepository;
import com.kodewala.payment.requet.AccountCreateRequest;
import com.kodewala.payment.requet.PaymentRequest;

import jakarta.transaction.Transactional;

@Service
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public AccountCreateEntity createAccount(AccountCreateRequest accountCreateRequest) {

		AccountCreateEntity accountCreateEntity = new AccountCreateEntity();

		accountCreateEntity.setAccountNumber(accountCreateRequest.getAccountNumber());
		accountCreateEntity.setAmount(accountCreateRequest.getAmount());
		accountCreateEntity.setMobileNumber(accountCreateRequest.getMobileNumber());
		accountCreateEntity.setPanNumber(accountCreateRequest.getPanNumber());
		accountCreateEntity.setPassword(accountCreateRequest.getPassword());

		AccountCreateEntity result = paymentRepository.save(accountCreateEntity);

		return result;

	}

	@Transactional
	@Override
	public AccountCreateEntity doPayment(PaymentRequest paymentRequest) {

		double amountTobeTransfer = paymentRequest.getAmount();

		String fromAccountNumber = paymentRequest.getFromAccount();

		AccountCreateEntity fromAccountDetails = paymentRepository.findByAccountNumber(fromAccountNumber);

		// Exception

		if (fromAccountDetails == null) {

			throw new AccountNotFound("Account Not Found....");
		}
		// Exception
		System.out.println(fromAccountDetails.getPassword());
		if (fromAccountDetails.getStatus().equalsIgnoreCase("DEACTIVATE")) {

			throw new DeActivateException("Sender Account is DEACTIVATE");
		}

		// Exception

		if (amountTobeTransfer > fromAccountDetails.getAmount()) {

			throw new InsufficientBalance("Insufficient Balance....");
		}

		fromAccountDetails.setAmount(fromAccountDetails.getAmount() - amountTobeTransfer);

		// fromAccountDetails.setPassword("jsnbdhfvjhc");

		paymentRepository.save(fromAccountDetails);

		String toAccNumber = paymentRequest.getToAccount();

		AccountCreateEntity toAccDetails = paymentRepository.findByAccountNumber(toAccNumber);

		// Exception

		if (toAccDetails == null) {

			throw new AccountNotFound("Account Not Found....");

		}

		// Exception

		if (toAccDetails.getStatus().equalsIgnoreCase("DEACTIVATE")) {

			throw new DeActivateException("Receiver Account is DEACTIVATE");
		}

		toAccDetails.setAmount(toAccDetails.getAmount() + amountTobeTransfer);

		paymentRepository.save(toAccDetails);

		AccountCreateEntity result1 = paymentRepository.findByAccountNumber(fromAccountNumber);

		
		System.out.println(result1.getPassword());
		
		return result1;

	}

}
