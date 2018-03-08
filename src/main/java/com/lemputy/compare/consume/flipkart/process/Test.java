package com.lemputy.compare.consume.flipkart.process;

import com.lemputy.compare.consume.flipkart.apis.IGenerateLinksService;
import com.lemputy.compare.consume.flipkart.apis.impl.GenerateLinkService;
import com.lemputy.compare.consume.flipkart.persistence.domain.FlipkartCategories;
import com.lemputy.compare.consume.flipkart.persistence.service.IFlipkartCategoryService;
import com.lemputy.compare.consume.flipkart.persistence.service.impl.FlipkartCreateCategoryImpl;

import java.util.Map;

public class Test {


    public static void main(String[] args) {

        IGenerateLinksService generateLinksService = new GenerateLinkService();
        Map<String, String> links = generateLinksService.getProductCategoryUrls();
        IFlipkartCategoryService service = new FlipkartCreateCategoryImpl();
        service.createCategories(new FlipkartCategories(), links);

    }

}