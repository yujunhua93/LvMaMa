package com.example.e450c.lvmama.entity;

import java.io.Serializable;

/**
 * Created by sunfusheng on 16/4/20.
 */
public class TravelingEntity  {


    private String location_name; // 标题
    private String image_url; // 图片地址
    private String price;
    private String about;


    // 暂无数据属性
    private boolean isNoData = false;
    private int height;

    public TravelingEntity() {
    }

    public TravelingEntity(String location_name, String price,  String about,String image_url) {
        this.location_name = location_name;
        this.price = price;
        this.image_url = image_url;
        this.about = about;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public boolean isNoData() {
        return isNoData;
    }

    public void setNoData(boolean noData) {
        isNoData = noData;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
