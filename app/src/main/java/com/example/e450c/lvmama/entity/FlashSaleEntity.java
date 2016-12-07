package com.example.e450c.lvmama.entity;

/**
 * Created by e450c on 2016/12/5.
 * 限时抢购实体类
 */

public class FlashSaleEntity {

    //折扣
    private String discount;
    //图片地址
    private String imageUrl;
    //剩余
    private String remainder;
    //简介
    private String summary;
    //原价
    private String originalPrice;
    //现价
    private String presentPrice;


    public FlashSaleEntity(String discount, String imageUrl, String remainder, String summary, String originalPrice, String presentPrice) {
        this.discount = discount;
        this.imageUrl = imageUrl;
        this.remainder = remainder;
        this.summary = summary;
        this.originalPrice = originalPrice;
        this.presentPrice = presentPrice;
    }

    public String getRemainder() {
        return remainder;
    }

    public void setRemainder(String remainder) {
        this.remainder = remainder;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPresentPrice() {
        return presentPrice;
    }

    public void setPresentPrice(String presentPrice) {
        this.presentPrice = presentPrice;
    }
}
