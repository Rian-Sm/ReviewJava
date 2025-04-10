package com.rns.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Start Demo");

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Customer customer = context.getBean(Customer.class);

		System.out.println(customer.toString());

		System.out.println("End Demo");
	}
}
