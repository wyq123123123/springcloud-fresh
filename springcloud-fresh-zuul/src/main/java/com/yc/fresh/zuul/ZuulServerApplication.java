package com.yc.fresh.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.yc.fresh.zuul.filter.TokenFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
	
	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
	}
}
