package com.example.jsonpayload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JsonpayloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonpayloadApplication.class, args);
	}

}
