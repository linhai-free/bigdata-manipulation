package com.tradingvision.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:conf/applicationContext.xml"})
public class BigdataManipulationApplication {
	public static void main(String[] args) {
		SpringApplication.run(BigdataManipulationApplication.class, args);
	}
}
