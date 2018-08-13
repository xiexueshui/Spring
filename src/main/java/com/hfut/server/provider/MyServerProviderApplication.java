package com.hfut.server.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.hfut.mapper")
@EnableDiscoveryClient
@Slf4j
public class MyServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyServerProviderApplication.class, args);
		log.info("ServerProvider 启动!");
	}
}
