package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Component
@ComponentScan
@EnableAutoConfiguration
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeOperationsImpl operations;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee james = new Employee();
		james.setId(100);
		james.setName("James Cooper");
		operations.writeObject(james);
		System.out.println("Object written to file");
	}
}
