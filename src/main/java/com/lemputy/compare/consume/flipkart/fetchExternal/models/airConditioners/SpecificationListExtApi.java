package com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecificationListExtApi {

    @JsonProperty("values")
    private ValuesExtApi[] values;

    @JsonProperty("key")
    private String key;

    public ValuesExtApi[] getValues() {
        return values;
    }

    public void setValues(ValuesExtApi[] values) {
        this.values = values;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "SpecificationListExtApi{" +
                "values=" + Arrays.toString(values) +
                ", key='" + key + '\'' +
                '}';
    }
}
