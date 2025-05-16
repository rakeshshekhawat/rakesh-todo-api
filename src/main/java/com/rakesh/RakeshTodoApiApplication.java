package com.rakesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class RakeshTodoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakeshTodoApiApplication.class, args);
	}

	@Bean
	public OpenAPI springToDoOpenApi () {
		return new OpenAPI().info(new Info().title("Rakesh Todo Api").description("Demo app").version("v0.0.1").license(new License().
				name("Apache 2.0.1").url("www.springboot.org"))).externalDocs(new ExternalDocumentation().description("ToDo Documentation").url("https://github.com/rakeshshekhawat/rakesh-todo-api"));
	}
}
