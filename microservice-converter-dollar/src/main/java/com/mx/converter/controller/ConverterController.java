package com.mx.converter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.converter.model.ConvertionDollarDTO;

//@RefreshScope
@RestController
@RequestMapping("/converter")
public class ConverterController
{

	@Value("${current.value.dollar}")
    private double valueDollar;

    @RequestMapping(value = "/greting", method = RequestMethod.GET)
    public String getServiceName() {
        return "service name [" + this.valueDollar + "]";
    }

	@RequestMapping(value="/dollar-mxn", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ConvertionDollarDTO convert(@RequestBody  ConvertionDollarDTO qty) {
     	return new ConvertionDollarDTO(qty.getQuantity()*valueDollar);		
    }
}