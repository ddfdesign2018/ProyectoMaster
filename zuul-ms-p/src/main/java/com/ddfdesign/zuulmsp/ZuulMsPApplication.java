package com.ddfdesign.zuulmsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulServer
public class ZuulMsPApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulMsPApplication.class, args);
	}
}
