package com.cloud.model;

import java.io.Serializable;

public class ConvertionDollarDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private  Double quantity;
    
    public ConvertionDollarDTO() {
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

    
}