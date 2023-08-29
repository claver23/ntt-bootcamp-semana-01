package com.bootcamp.projectosemana01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;


@SpringBootApplication
public class ProjectsSemana01Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectsSemana01Application.class, args);
	}

}
