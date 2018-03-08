package com.lemputy.compare.consume.flipkart.persistence.service.impl;

import com.lemputy.compare.consume.flipkart.persistence.domain.FlipkartCategories;
import com.lemputy.compare.consume.flipkart.persistence.respository.FlipkartCategoryRepository;
import com.lemputy.compare.consume.flipkart.persistence.service.IFlipkartCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Map;

/**
 * @author rams0516
 *         Date: 3/8/2018
 *         Time: 4:48 PM
 */

@Service
public class FlipkartCreateCategoryImpl implements IFlipkartCategoryService{

    @Autowired
    private FlipkartCategoryRepository flipkartCategoryRepository;

    @Override
    public void createCategories(FlipkartCategories categories, Map<String, String> categoriesMap) {
        Iterator iterator = categoriesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            categories.setCategoryName(pair.getKey().toString());
            categories.setCategoryUrl(pair.getValue().toString());
        }

        System.out.println("Camer here debug");
        flipkartCategoryRepository.save(categories);
        System.out.println("out");
    }
}