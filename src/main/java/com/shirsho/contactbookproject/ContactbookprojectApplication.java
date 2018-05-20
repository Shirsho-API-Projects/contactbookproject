package com.shirsho.contactbookproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan({"org.codehaus.jackson.jaxrs","com.shirsho.contactbookproject"})
@SpringBootApplication
public class ContactbookprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactbookprojectApplication.class, args);
	}
}
