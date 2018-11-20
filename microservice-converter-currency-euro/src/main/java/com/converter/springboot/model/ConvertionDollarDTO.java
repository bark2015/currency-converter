package com.converter.springboot.model;

import java.io.Serializable;

public class ConvertionDollarDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private Double quantity;

    public ConvertionDollarDTO(){
    	this.quantity = 0.0;
    }
    
	public ConvertionDollarDTO(Double quantity) {
		super();
		this.quantity = quantity;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}   
}