package com.example.e450c.lvmama.entity;

/**
 * Created by e450c on 2016/12/2.
 */

public class HomeVirticalAdEntity {

    //标签
    private String flag;
    //标题
    private String title;
    //地址
    private String url;

    public HomeVirticalAdEntity( String title, String flag,String url) {
        this.flag = flag;
        this.title = title;
        this.url = url;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
