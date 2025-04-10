package com.example.App;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.App.Service.ExampleService;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppApplication.class);

        ExampleService myService = context.getBean(ExampleService.class);
		
        myService.execute();

        context.close();
	}

}
