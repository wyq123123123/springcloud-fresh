package com.yc.fresh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@MapperScan("com.yc.fresh.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableRedisHttpSession
public class FreshGoodsApplication {
	public static void main(String[] args) {
		SpringApplication.run(FreshGoodsApplication.class, args);
	}
}
