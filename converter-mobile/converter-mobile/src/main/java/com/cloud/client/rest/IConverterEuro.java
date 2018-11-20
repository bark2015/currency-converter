package com.cloud.client.rest;

import org.springframework.web.bind.annotation.RequestBody;

import com.cloud.model.Convertion;

public interface IConverterEuro {

	 Convertion converterEuro(@RequestBody  Convertion qty);
}
