package com.basedati.testbasedati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.basedati.testbasedati")public class TestbasedatiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestbasedatiApplication.class, args);
	}

}
