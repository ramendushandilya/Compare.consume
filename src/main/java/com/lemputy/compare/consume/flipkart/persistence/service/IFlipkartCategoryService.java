package com.lemputy.compare.consume.flipkart.persistence.service;

import com.lemputy.compare.consume.flipkart.persistence.domain.FlipkartCategories;

import java.util.List;
import java.util.Map;

/**
 * @author rams0516
 *         Date: 3/8/2018
 *         Time: 4:45 PM
 */
public interface IFlipkartCategoryService {

    void createCategories(Map<String , String> categoriesMap);

}