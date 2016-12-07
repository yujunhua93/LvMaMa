package com.example.e450c.lvmama.entity;

import java.io.Serializable;

/**
 * Created by sunfusheng on 16/4/20.
 */
public class HomeBigMenuEntity implements Serializable {

    private String title;
    private String tips;
    private String image_url;
    private int default_image_url;

    public HomeBigMenuEntity() {
    }

    public HomeBigMenuEntity(String title, String tips, String image_url, int default_image_url) {
        this.title = title;
        this.tips = tips;
        this.image_url = image_url;
        this.default_image_url = default_image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getDefault_image_url() {
        return default_image_url;
    }

    public void setDefault_image_url(int default_image_url) {
        this.default_image_url = default_image_url;
    }
}
