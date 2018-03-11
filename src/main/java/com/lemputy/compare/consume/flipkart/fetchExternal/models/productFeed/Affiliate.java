
package com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Affiliate {

    @SerializedName("apiListings")
    private com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.ApiListings ApiListings;
    @SerializedName("name")
    private String Name;

    public com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.ApiListings getApiListings() {
        return ApiListings;
    }

    public void setApiListings(com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.ApiListings apiListings) {
        ApiListings = apiListings;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
