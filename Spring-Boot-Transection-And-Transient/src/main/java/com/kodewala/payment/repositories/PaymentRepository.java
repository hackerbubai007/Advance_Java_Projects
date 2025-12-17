package com.kodewala.payment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.payment.entity.AccountCreateEntity;

public interface PaymentRepository extends JpaRepository<AccountCreateEntity, Integer> {

	public AccountCreateEntity findByAccountNumber(String accountNumber);

}
