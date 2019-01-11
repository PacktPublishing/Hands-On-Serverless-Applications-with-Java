package com.packtpub.springfunctions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringFunctionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFunctionsApplication.class, args);
	}

    @Bean
    public Function<String, String> uppercase() {
        return value -> value.toUpperCase();
    }

}

