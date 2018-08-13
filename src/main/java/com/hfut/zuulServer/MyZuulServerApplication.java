package com.hfut.zuulServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
@SpringBootApplication
@Slf4j
@EnableZuulProxy
public class MyZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyZuulServerApplication.class, args);
		log.info("ServerProvider 启动!");
	}
	@Bean
	public CustomPreFilter getPreFilter() {
		return new CustomPreFilter();
	}
}
