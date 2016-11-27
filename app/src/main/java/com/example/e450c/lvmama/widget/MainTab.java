package com.example.e450c.lvmama.widget;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.fragment.DestinationFragment;
import com.example.e450c.lvmama.fragment.HomePageFragment;
import com.example.e450c.lvmama.fragment.PeripheryFragment;
import com.example.e450c.lvmama.fragment.SaleFragment;
import com.example.e450c.lvmama.fragment.UserFragment;

/**
 * Created by e450c on 2016/11/17.
 */
    public enum MainTab{
        HOMEPAGE(0, R.drawable.tab_1_normal,R.drawable.tab_1_pressed, HomePageFragment.class),
        SALE(1,R.drawable.tab_2_normal,R.drawable.tab_2_pressed, SaleFragment.class),
        DESTINATION(2,R.drawable.tab_3_normal,R.drawable.tab_3_pressed, DestinationFragment.class),
        PERIPHERY(3,R.drawable.tab_4_normal,R.drawable.tab_4_pressed, PeripheryFragment.class),
        USER(4,R.drawable.tab_5_normal,R.drawable.tab_5_pressed, UserFragment.class);


    private int idx;
    private int resName;
    private int resIcon;
    private Class<?> clz;

    private MainTab(int idx, int resName, int resIcon, Class<?> clz) {
        this.idx = idx;
        this.resName = resName;
        this.resIcon = resIcon;
        this.clz = clz;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }
}

