package com.kodewala.invoice_generation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.invoice_generation.entity.InvoiceEntity;
import com.kodewala.invoice_generation.request.InvoiceRequest;
import com.kodewala.invoice_generation.service.InvoiceService;

@RestController
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;

	@PostMapping("/generate-invoice")
	public String generateInvoice(@RequestBody InvoiceRequest invoiceRequest) {

		invoiceService.generateInvoice(invoiceRequest);

		return "Invoice Generated Successfully!";

	}

	@PostMapping("getDetailsById")
	public InvoiceEntity getDetailsById(@RequestBody int id) {
		InvoiceEntity selectedDetails = invoiceService.getDetailsById(id);

		return selectedDetails;
	}
	
	
	@PostMapping("updateDetails")
	public String updateDetailsById(@RequestBody InvoiceRequest invoiceRequest) {
		
		String msg = invoiceService.updateInvoice(invoiceRequest);
		
		
		return msg;
		
		
	}
	
	
	@PostMapping("delete")
	public String deleteById(@RequestBody int id) {
		
		invoiceService.deleteInvoice(id);
		
		return "Invoicde deleted Successfully";
		
	}
	
	

}
