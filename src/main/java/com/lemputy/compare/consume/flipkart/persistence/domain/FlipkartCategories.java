package com.lemputy.compare.consume.flipkart.persistence.domain;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 3/8/2018
 *         Time: 4:31 PM
 */

@Entity
public class FlipkartCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "catId", nullable = false, updatable = false)
    private Long id;

    private String categoryName;
    private String categoryUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryUrl() {
        return categoryUrl;
    }

    public void setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl;
    }
}