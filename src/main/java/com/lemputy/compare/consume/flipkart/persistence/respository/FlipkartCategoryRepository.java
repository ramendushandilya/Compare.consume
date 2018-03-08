package com.lemputy.compare.consume.flipkart.persistence.respository;

import com.lemputy.compare.consume.flipkart.persistence.domain.FlipkartCategories;
import org.springframework.data.repository.CrudRepository;

/**
 * @author rams0516
 *         Date: 3/8/2018
 *         Time: 4:43 PM
 */
public interface FlipkartCategoryRepository extends CrudRepository<FlipkartCategories, Long>{

}