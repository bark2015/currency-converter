package com.cloud.client.rest.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cloud.client.rest.IConverterDollar;
import com.cloud.model.ConvertionDollarDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConverterDollarImpl implements IConverterDollar {

	//@Value("${current.value.dollar}")
    //private String urlConverterDollar = "http://localhost:8083/converter-dollar/api/dollar-mxn/";
	@Value("${url.converter.dollar}")
    private String urlConverterDollar;
	
	@HystrixCommand(fallbackMethod = "converterDefaulError")
	@Override
	public ConvertionDollarDTO converterDollar(ConvertionDollarDTO qty) {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<ConvertionDollarDTO> request = new HttpEntity<>(qty);
		
		ResponseEntity<ConvertionDollarDTO> response = restTemplate.exchange(urlConverterDollar, HttpMethod.POST, request, ConvertionDollarDTO.class);
		
		return response.getBody();
	}

	public ConvertionDollarDTO converterDefaulError(ConvertionDollarDTO qty) {
		System.out.println("default");
		ConvertionDollarDTO defaultDto = new ConvertionDollarDTO();
		defaultDto.setQuantity(qty.getQuantity()*17.0);
		return defaultDto;
	}
}
