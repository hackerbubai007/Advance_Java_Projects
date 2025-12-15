package com.kodewala.invoice_generation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.invoice_generation.entity.InvoiceEntity;
import com.kodewala.invoice_generation.repositories.IinvoiceRepo;
import com.kodewala.invoice_generation.request.InvoiceRequest;

@Service
public class InvoiceService {

	@Autowired
	IinvoiceRepo iinvoiceRepo;

	// create

	public int generateInvoice(InvoiceRequest invoiceRequest) {

		InvoiceEntity invoiceEntity = new InvoiceEntity();

		invoiceEntity.setInvValue(invoiceRequest.getInvValue());
		invoiceEntity.setNote(invoiceRequest.getNote());
		invoiceEntity.setGstNum(invoiceRequest.getGstNum());
		invoiceEntity.setDescription(invoiceRequest.getDescription());
		invoiceEntity.setStatus(invoiceRequest.getStatus());

		invoiceEntity = iinvoiceRepo.save(invoiceEntity);

		return invoiceEntity.getInvId();
	}

	// read

	public InvoiceEntity getDetailsById(int invId) {

		InvoiceEntity details = iinvoiceRepo.findById(invId).get();

		return details;
	}

	// update

	public String updateInvoice(InvoiceRequest invoiceRequest) {

		InvoiceEntity invoiceEntity = iinvoiceRepo.findById(invoiceRequest.getInvId()).get();

		// Partial update (PATCH style)
		if (invoiceRequest.getInvValue() != 0) {
			invoiceEntity.setInvValue(invoiceRequest.getInvValue());
		}

		if (invoiceRequest.getNote() != null && !invoiceRequest.getNote().trim().isEmpty()) {
			invoiceEntity.setNote(invoiceRequest.getNote());
		}

		if (invoiceRequest.getGstNum() != null && !invoiceRequest.getGstNum().trim().isEmpty()) {
			invoiceEntity.setGstNum(invoiceRequest.getGstNum());
		}

		if (invoiceRequest.getDescription() != null && !invoiceRequest.getDescription().trim().isEmpty()) {
			invoiceEntity.setDescription(invoiceRequest.getDescription());
		}

		if (invoiceRequest.getStatus() != null && !invoiceRequest.getStatus().trim().isEmpty()) {
			invoiceEntity.setStatus(invoiceRequest.getStatus());
		}

		iinvoiceRepo.save(invoiceEntity);

		return "Invoice updated successfully!";
	}

	// delete
	
	public String deleteInvoice(int invId) {
		
		iinvoiceRepo.deleteById(invId);
		
		return "Invoice deleted successfully!";
	}
	
	
	

}
