package com.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.client.rest.IConverterDollar;
import com.cloud.client.rest.IConverterEuro;
import com.cloud.model.Convertion;
import com.cloud.model.ConvertionDollarDTO;
import com.cloud.service.IConverter;

@Service
public class ConverterImpl implements IConverter{

	@Autowired
	private IConverterEuro converterEuro;
	
	@Autowired
	private IConverterDollar converterDollar;
	
	@Override
	public double convert(String from, String to, double qty) {
		double result = 0.0;
		
		System.out.println("Origen:"+from + " destino:"+to + " qty:"+qty);
		if("P".equals(from) && "E".equals(to)){
			Convertion c = new Convertion();
			c.setQuantity(qty);
			result = converterEuro.converterEuro(c).getQuantity();
		}
		
		if("P".equals(from) && "D".equals(to)){
			ConvertionDollarDTO c = new ConvertionDollarDTO();
			c.setQuantity(qty);
			result = converterDollar.converterDollar(c).getQuantity();
			System.out.println("detino:"+result);
		}
		
		return result;
	}
}