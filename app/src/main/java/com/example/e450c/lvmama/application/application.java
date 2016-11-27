package com.example.e450c.lvmama.application;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;


/**
 * Created by e450c on 2016/11/17.
 */

public class application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
