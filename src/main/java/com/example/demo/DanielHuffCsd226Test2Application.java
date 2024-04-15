package com.example.demo;

import com.example.demo.model.DataEntity;
import com.example.demo.repository.DataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DanielHuffCsd226Test2Application {

	public static void main(String[] args) {
		SpringApplication.run(DanielHuffCsd226Test2Application.class, args);
	}


	// Attempted to put a hardcoded entry into database
	// Continue to run into issue where @Bean for repository is required
	// We've run into this issue before, causing incredible headaches
	// Tried to implement some starter data though dependency and now asking for database
	// Gone as far as time will allow
	@Bean
	public CommandLineRunner demo(DataRepository repository) {
		return (args) -> {
			repository.save(new DataEntity("hello",42));
		};

	}
}
