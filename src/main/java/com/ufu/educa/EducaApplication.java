package com.ufu.educa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.ufu.educa.controller"})
public class EducaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EducaApplication.class, args);
	}

}
