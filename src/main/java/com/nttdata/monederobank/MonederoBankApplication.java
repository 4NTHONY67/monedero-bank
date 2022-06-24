package com.nttdata.monederobank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MonederoBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonederoBankApplication.class, args);
	}

}
