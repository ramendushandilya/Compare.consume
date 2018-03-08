package com.lemputy.compare.consume.flipkart.process;

import com.lemputy.compare.consume.flipkart.apis.IGenerateLinksService;
import com.lemputy.compare.consume.flipkart.apis.impl.GenerateLinkService;

public class Test {

    public static void main(String[] args) {

        IGenerateLinksService generateLinksService = new GenerateLinkService();
        generateLinksService.getProductCategoryUrls();

    }

}