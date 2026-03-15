package com.browse.browse_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BrowseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrowseServiceApplication.class, args);
	}

}
