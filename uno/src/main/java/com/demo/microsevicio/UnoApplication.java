package com.demo.microsevicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnoApplication.class, args);
	}
}
