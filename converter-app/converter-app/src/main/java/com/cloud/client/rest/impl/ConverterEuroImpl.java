package com.cloud.client.rest.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cloud.client.rest.IConverterEuro;
import com.cloud.model.Convertion;

@Service
public class ConverterEuroImpl implements IConverterEuro {

	@Value("${url.converter.dollar}")
    private String urlConverterDollar;
	
	@Override
	public  Convertion converterEuro(Convertion qty){
		
		return null;
	}

}
