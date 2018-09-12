package com.ddfdesign.cachorromsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableJpaRepositories
public class CachorroMsPApplication {

	public static void main(String[] args) {

		SpringApplication.run(CachorroMsPApplication.class, args);
		System.out.println();
		System.out.println();

	}
}