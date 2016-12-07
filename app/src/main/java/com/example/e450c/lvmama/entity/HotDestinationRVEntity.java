package com.example.e450c.lvmama.entity;

/**
 * Created by e450c on 2016/12/5.
 * 热门目的地列表实体类
 */

public class HotDestinationRVEntity {

    private String destinationName;

    private String imageUrl;

    private String url;

    public HotDestinationRVEntity(String destinationName, String imageUrl, String url) {
        this.destinationName = destinationName;
        this.imageUrl = imageUrl;
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
