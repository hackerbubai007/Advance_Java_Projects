package com.kodewala.invoice_generation.repositories;

import org.springframework.data.repository.CrudRepository;

import com.kodewala.invoice_generation.entity.InvoiceEntity;

public interface IinvoiceRepo extends CrudRepository<InvoiceEntity, Integer>{

}
