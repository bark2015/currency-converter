package com.mx.converter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.mx"})
@EnableEurekaClient
public class ConverterDollarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConverterDollarApplication.class, args);
	}
}
