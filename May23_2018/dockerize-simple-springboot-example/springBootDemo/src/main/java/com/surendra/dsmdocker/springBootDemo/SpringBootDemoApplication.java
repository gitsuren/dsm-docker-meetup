package com.surendra.dsmdocker.springBootDemo;

import com.surendra.dsmdocker.springBootDemo.domain.Person;
import com.surendra.dsmdocker.springBootDemo.repositories.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		personRepository.save(new Person("Surendra", "Bajracharya"));
		personRepository.save(new Person("Sanjay", "Shrestha"));
		personRepository.save(new Person("Alen", "Kansakar"));

	}
}