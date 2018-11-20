package com.converter.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.converter.springboot.model.ConvertionDollarDTO;

@RestController
@RequestMapping("/api")
@RefreshScope
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Value("${current.value.euro}")
    private double valueEuro;

	@RequestMapping(value = "/greeting/", method = RequestMethod.GET)
    public String getServiceName() {
        return "service name [" + this.valueEuro + "]";
    }

	@RequestMapping(value="/euro-mxn/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ConvertionDollarDTO convert(@RequestBody  ConvertionDollarDTO qty) {
     	return new ConvertionDollarDTO(qty.getQuantity()*valueEuro);		
    }
}