package com.fernando.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Eliminate verbosity in creating Java Beans
 * Automactly create public accessor methos, constructor
 * equals, hashcode and toString...
 * Released in JDK 16 */
record Person (String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Fernando";
	}
	
	@Bean
	public int age() {
		return 31;
	}
	
	@Bean
	public Person person() {
		return new Person("Milo", 6, new Address("Rua Persona", "City"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Rua Local", "Cidade");
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("Rua da Amora", "Amoralandia");
	}

}
