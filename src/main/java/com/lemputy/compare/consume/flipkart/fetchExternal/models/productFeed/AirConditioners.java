
package com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AirConditioners {

    @SerializedName("apiName")
    private String ApiName;
    @SerializedName("availableVariants")
    private com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.AvailableVariants AvailableVariants;

    public String getApiName() {
        return ApiName;
    }

    public void setApiName(String apiName) {
        ApiName = apiName;
    }

    public com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.AvailableVariants getAvailableVariants() {
        return AvailableVariants;
    }

    public void setAvailableVariants(com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.AvailableVariants availableVariants) {
        AvailableVariants = availableVariants;
    }

}
