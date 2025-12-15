package com.kodewala.invoice_generation.request;

public class InvoiceRequest {

	private int invId;
	

	private int invValue;
	private String note;
	private String gstNum;
	private String status;
	private String description;

	public int getInvValue() {
		return invValue;
	}

	public void setInvValue(int invValue) {
		this.invValue = invValue;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getGstNum() {
		return gstNum;
	}

	public void setGstNum(String gstNum) {
		this.gstNum = gstNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getInvId() {
		return invId;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

}
