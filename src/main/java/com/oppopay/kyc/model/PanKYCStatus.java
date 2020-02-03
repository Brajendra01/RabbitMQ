package com.oppopay.kyc.model;

import java.io.Serializable;

public class PanKYCStatus implements Serializable{ 
	
	private static final long serialVersionUID = -6121369853598143521L;
	
	private String panNumber; 
	private String name;
	private String statusDesc;
	
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	
}
