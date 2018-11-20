package com.mx.converter.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.mx.converter.filters.PreFilter;
import com.mx.converter.filters.SpecialRoutesFilter;

@EnableZuulProxy
@SpringBootApplication(scanBasePackages={"com.mx.converter"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class GatewayApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	
	@Bean
	public SpecialRoutesFilter routeFilter() {
	    return new SpecialRoutesFilter();
	}
	
	@Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }
}
