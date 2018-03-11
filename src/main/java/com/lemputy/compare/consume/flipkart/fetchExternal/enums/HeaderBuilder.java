package com.lemputy.compare.consume.flipkart.fetchExternal.enums;

//Analyse usage over time, if not required to be delete
public enum HeaderBuilder {

    HEADER("?/Fk-Affiliate-Id=ramendu98&Fk-Affiliate-Token=acbfa63280704742bdcb1c3d30de0b9e");

    private final String text;

    HeaderBuilder(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}