package com.example.SpringDataREST;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SpringDataREST.model.Customer;
import com.example.SpringDataREST.repository.CustomerRepository;

@Configuration
public class LoadDatabase {

	Logger log = LoggerFactory.getLogger(LoadDatabase.class.getName());

	@Bean
	public CommandLineRunner initDatabase(CustomerRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new Customer(1, "sv@gmail.com", "Shubham")));
			log.info("Preloading " + repository.save(new Customer(2, "shruti@gmail.com", "Shruti")));
		};
	}
}
