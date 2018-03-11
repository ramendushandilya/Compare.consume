package com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirConditionersExtApi {

    @JsonProperty("nextUrl")
    private String nextUrl;

    @JsonProperty("validTill")
    private String validTill;

    @JsonProperty("lastProductId")
    private String lastProductId;

    @JsonProperty("products")
    private List<ProductsExtApi> products;

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public String getLastProductId() {
        return lastProductId;
    }

    public void setLastProductId(String lastProductId) {
        this.lastProductId = lastProductId;
    }

    public List<ProductsExtApi> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsExtApi> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "AirConditionersExtApi{" +
                "nextUrl='" + nextUrl + '\'' +
                ", validTill='" + validTill + '\'' +
                ", lastProductId='" + lastProductId + '\'' +
                ", products=" + products +
                '}';
    }
}
