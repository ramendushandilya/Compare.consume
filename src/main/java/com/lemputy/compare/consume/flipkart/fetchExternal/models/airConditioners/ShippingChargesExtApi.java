package com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingChargesExtApi {

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("currency")
    private String currency;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "ShippingChargesExtApi{" +
                "amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
