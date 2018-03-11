package com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsExtApi {

    @JsonProperty("productBaseInfoV1")
    private BaseInfoExtApi baseInfo;

    @JsonProperty("productShippingInfoV1")
    private ShippingInfoExtApi shippingInfo;

    @JsonProperty("categorySpecificInfoV1")
    private CategorySpecificInfoExtApi cateforySpecificInfo;

    public BaseInfoExtApi getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfoExtApi baseInfo) {
        this.baseInfo = baseInfo;
    }

    public ShippingInfoExtApi getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfoExtApi shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public CategorySpecificInfoExtApi getCateforySpecificInfo() {
        return cateforySpecificInfo;
    }

    public void setCateforySpecificInfo(CategorySpecificInfoExtApi cateforySpecificInfo) {
        this.cateforySpecificInfo = cateforySpecificInfo;
    }



    @Override
    public String toString() {
        return "ProductsExtApi{" +
                "baseInfo=" + baseInfo +
                ", shippingInfo=" + shippingInfo +
                ", cateforySpecificInfo=" + cateforySpecificInfo +
                '}';
    }
}
