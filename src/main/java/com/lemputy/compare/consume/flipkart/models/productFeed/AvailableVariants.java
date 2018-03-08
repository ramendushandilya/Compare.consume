
package com.lemputy.compare.consume.flipkart.models.productFeed;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AvailableVariants {

    @SerializedName("v0.1.0")
    private com.lemputy.compare.consume.flipkart.models.productFeed.V010 V010;
    @SerializedName("v1.1.0")
    private com.lemputy.compare.consume.flipkart.models.productFeed.V110 V110;

    public com.lemputy.compare.consume.flipkart.models.productFeed.V010 getV010() {
        return V010;
    }

    public void setV010(com.lemputy.compare.consume.flipkart.models.productFeed.V010 v010) {
        V010 = v010;
    }

    public com.lemputy.compare.consume.flipkart.models.productFeed.V110 getV110() {
        return V110;
    }

    public void setV110(com.lemputy.compare.consume.flipkart.models.productFeed.V110 v110) {
        V110 = v110;
    }

}
