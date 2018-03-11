package com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseInfoExtApi {

    @JsonProperty("productId")
    private String productId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("productDescription")
    private String productDescription;

    @JsonProperty("imageUrls")
    private ImageUrlsExtApi imageUrls;

    @JsonProperty("productFamily")
    private String[] productFamily;

    @JsonProperty("maximumRetailPrice")
    private MaximumRetailPriceExtApi mrp;

    @JsonProperty("flipkartSellingPrice")
    private FlipkartSellingPriceExtApi fsp;

    @JsonProperty("flipkartSpecialPrice")
    private FlipkartSpecialPriceExtApi fspDash;

    @JsonProperty("productUrl")
    private String productUrl;

    @JsonProperty("productBrand")
    private String brand;

    @JsonProperty("inStock")
    private String inStock;

    @JsonProperty("codAvailable")
    private String codAvailable;

    @JsonProperty("discountPercentage")
    private String discountPercentage;

    @JsonProperty("offers")
    private String[] offers;

    @JsonProperty("categoryPath")
    private String categoryPath;

    @JsonProperty("attributes")
    private AttributesExtApi attributes;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public ImageUrlsExtApi getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ImageUrlsExtApi imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String[] getProductFamily() {
        return productFamily;
    }

    public void setProductFamily(String[] productFamily) {
        this.productFamily = productFamily;
    }

    public MaximumRetailPriceExtApi getMrp() {
        return mrp;
    }

    public void setMrp(MaximumRetailPriceExtApi mrp) {
        this.mrp = mrp;
    }

    public FlipkartSellingPriceExtApi getFsp() {
        return fsp;
    }

    public void setFsp(FlipkartSellingPriceExtApi fsp) {
        this.fsp = fsp;
    }

    public FlipkartSpecialPriceExtApi getFspDash() {
        return fspDash;
    }

    public void setFspDash(FlipkartSpecialPriceExtApi fspDash) {
        this.fspDash = fspDash;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String getCodAvailable() {
        return codAvailable;
    }

    public void setCodAvailable(String codAvailable) {
        this.codAvailable = codAvailable;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String[] getOffers() {
        return offers;
    }

    public void setOffers(String[] offers) {
        this.offers = offers;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    public AttributesExtApi getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributesExtApi attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "BaseInfoExtApi{" +
                "productId='" + productId + '\'' +
                ", title='" + title + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", imageUrls=" + imageUrls +
                ", productFamily=" + Arrays.toString(productFamily) +
                ", mrp=" + mrp +
                ", fsp=" + fsp +
                ", fspDash=" + fspDash +
                ", productUrl='" + productUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", inStock='" + inStock + '\'' +
                ", codAvailable='" + codAvailable + '\'' +
                ", discountPercentage='" + discountPercentage + '\'' +
                ", offers=" + Arrays.toString(offers) +
                ", categoryPath='" + categoryPath + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
