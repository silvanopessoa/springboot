package br.com.silvanopessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}
}
