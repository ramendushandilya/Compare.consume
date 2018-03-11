package com.lemputy.compare.consume.flipkart.persistence.service.impl;

import com.lemputy.compare.consume.flipkart.persistence.domain.FlipkartCategories;
import com.lemputy.compare.consume.flipkart.persistence.respository.FlipkartCategoryRepository;
import com.lemputy.compare.consume.flipkart.persistence.service.IFlipkartCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
    public void createCategories(Map<String, String> categoriesMap) {

        FlipkartCategories cats = new FlipkartCategories();
        List<FlipkartCategories> categories = new LinkedList<>();
        Iterator iterator = categoriesMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            cats.setCategoryName(pair.getKey().toString());
            cats.setCategoryUrl(pair.getValue().toString());
            flipkartCategoryRepository.save(cats);
            //categories.add(cats);
            System.out.println("Going to persist id ===>>"+cats.getId()+"--"+cats.getCategoryName());
        }
        //flipkartCategoryRepository.saveAll(categories);
    }
}