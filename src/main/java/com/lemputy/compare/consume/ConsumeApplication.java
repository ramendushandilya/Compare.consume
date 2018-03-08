package com.lemputy.compare.consume;

import com.lemputy.compare.consume.flipkart.apis.IGenerateLinksService;
import com.lemputy.compare.consume.flipkart.persistence.domain.FlipkartCategories;
import com.lemputy.compare.consume.flipkart.persistence.service.IFlipkartCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class ConsumeApplication implements CommandLineRunner{

	@Autowired
	private IFlipkartCategoryService flipkartCategoryService;

	@Autowired
	private IGenerateLinksService generateLinksService;

	public static void main(String[] args) {
		SpringApplication.run(ConsumeApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Map<String, String> links = generateLinksService.getProductCategoryUrls();

		flipkartCategoryService.createCategories(new FlipkartCategories(),links);
	}
}
