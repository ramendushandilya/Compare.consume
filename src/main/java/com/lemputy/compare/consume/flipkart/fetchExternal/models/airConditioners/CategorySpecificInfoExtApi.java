package com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategorySpecificInfoExtApi {

    @JsonProperty("keySpecs")
    private String[] keySpecs;

    @JsonProperty("detailedSpecs")
    private String[] detailedSpecs;

    @JsonProperty("specificationList")
    private SpecificationListExtApi[] specificationList;

    public String[] getKeySpecs() {
        return keySpecs;
    }

    public void setKeySpecs(String[] keySpecs) {
        this.keySpecs = keySpecs;
    }

    public String[] getDetailedSpecs() {
        return detailedSpecs;
    }

    public void setDetailedSpecs(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    public SpecificationListExtApi[] getSpecificationList() {
        return specificationList;
    }

    public void setSpecificationList(SpecificationListExtApi[] specificationList) {
        this.specificationList = specificationList;
    }

    @Override
    public String toString() {
        return "CategorySpecificInfoExtApi{" +
                "keySpecs=" + Arrays.toString(keySpecs) +
                ", detailedSpecs=" + Arrays.toString(detailedSpecs) +
                ", specificationList=" + Arrays.toString(specificationList) +
                '}';
    }
}