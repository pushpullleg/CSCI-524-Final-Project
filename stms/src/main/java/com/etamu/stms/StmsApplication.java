package com.etamu.stms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.etamu.stms.repository")
public class StmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StmsApplication.class, args);
	}

}
