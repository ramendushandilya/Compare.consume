package com.lemputy.compare.consume;

import com.lemputy.compare.consume.flipkart.fetchExternal.apis.IGetProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumeApplication implements CommandLineRunner{

	@Autowired
	private IGetProductsService productsService;

	public static void main(String[] args) {
		SpringApplication.run(ConsumeApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		productsService.getAllAcs();
	}
}