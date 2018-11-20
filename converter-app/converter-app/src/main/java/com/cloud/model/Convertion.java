package com.cloud.model;

import java.io.Serializable;

public class Convertion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private  String to;
	private  String from;
    private  Double quantity;
    private  Double result;
    
    public Convertion() {
	}

    public Convertion(double initial) {
    	this.result = initial;
	}
    
	public Convertion(Double quantity) {
		this.quantity = quantity;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
}