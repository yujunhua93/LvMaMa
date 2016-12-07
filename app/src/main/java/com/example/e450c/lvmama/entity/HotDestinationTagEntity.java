package com.example.e450c.lvmama.entity;

/**
 * Created by e450c on 2016/12/5.
 *
 * 热门目的地底部标签实体类
 */

public class HotDestinationTagEntity {

    private String tagName;

    private String url;

    public HotDestinationTagEntity(String tagName, String url) {
        this.tagName = tagName;
        this.url = url;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
