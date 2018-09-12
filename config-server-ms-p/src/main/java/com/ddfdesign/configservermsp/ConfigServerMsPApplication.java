package com.ddfdesign.configservermsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerMsPApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigServerMsPApplication.class, args);
	}
}
