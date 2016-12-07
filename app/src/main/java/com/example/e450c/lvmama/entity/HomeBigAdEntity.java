package com.example.e450c.lvmama.entity;

/**
 * Created by e450c on 2016/12/4.
 */

public class HomeBigAdEntity {

    private String ad_url;
    private String url;

    public HomeBigAdEntity(String ad_url, String url) {
        this.ad_url = ad_url;
        this.url = url;
    }

    public String getAd_url() {
        return ad_url;
    }

    public void setAd_url(String ad_url) {
        this.ad_url = ad_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
