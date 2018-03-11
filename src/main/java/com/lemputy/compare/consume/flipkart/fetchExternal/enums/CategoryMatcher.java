package com.lemputy.compare.consume.flipkart.fetchExternal.enums;

public enum CategoryMatcher {

    AIRCONDITIONER("AirConditioners"),
    ;

    private final String text;

    CategoryMatcher(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}