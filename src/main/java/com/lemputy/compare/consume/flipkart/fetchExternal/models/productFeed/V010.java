
package com.lemputy.compare.consume.flipkart.fetchExternal.models.productFeed;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class V010 {

    @SerializedName("delete")
    private Object Delete;
    @SerializedName("deltaGet")
    private String DeltaGet;
    @SerializedName("get")
    private String Get;
    @SerializedName("post")
    private Object Post;
    @SerializedName("put")
    private Object Put;
    @SerializedName("resourceName")
    private String ResourceName;
    @SerializedName("top")
    private Object Top;

    public Object getDelete() {
        return Delete;
    }

    public void setDelete(Object delete) {
        Delete = delete;
    }

    public String getDeltaGet() {
        return DeltaGet;
    }

    public void setDeltaGet(String deltaGet) {
        DeltaGet = deltaGet;
    }

    public String getGet() {
        return Get;
    }

    public void setGet(String get) {
        Get = get;
    }

    public Object getPost() {
        return Post;
    }

    public void setPost(Object post) {
        Post = post;
    }

    public Object getPut() {
        return Put;
    }

    public void setPut(Object put) {
        Put = put;
    }

    public String getResourceName() {
        return ResourceName;
    }

    public void setResourceName(String resourceName) {
        ResourceName = resourceName;
    }

    public Object getTop() {
        return Top;
    }

    public void setTop(Object top) {
        Top = top;
    }

}
