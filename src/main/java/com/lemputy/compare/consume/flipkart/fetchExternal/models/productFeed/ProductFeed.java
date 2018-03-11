
package com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProductFeed {

    @SerializedName("apiGroups")
    private com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.ApiGroups ApiGroups;
    @SerializedName("description")
    private String Description;
    @SerializedName("title")
    private String Title;

    public com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.ApiGroups getApiGroups() {
        return ApiGroups;
    }

    public void setApiGroups(com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed.ApiGroups apiGroups) {
        ApiGroups = apiGroups;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

}
