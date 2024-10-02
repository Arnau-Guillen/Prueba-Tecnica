package com.inditex.api.ecomerce.ecomerceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.inditex.api.ecomerce.ecomerceapi.repository.Entity")
@EnableJpaRepositories(basePackages = "com.inditex.api.ecomerce.ecomerceapi.repository")
@ComponentScan({"com.inditex.api.ecomerce.ecomerceapi", "com.inditex.api.ecomerce.ecomerceapi.service.mapper"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
