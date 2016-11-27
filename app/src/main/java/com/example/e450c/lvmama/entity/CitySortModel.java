package com.example.e450c.lvmama.entity;

/**
 * Created by e450c on 2016/11/17.
 */

public class CitySortModel {

    private String name;//显示的数据

    private String  sortLetter;//显示数据拼音的首字母

    public String getSortLetter() {
        return sortLetter;
    }

    public void setSortLetter(String sortLetter) {
        this.sortLetter = sortLetter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
