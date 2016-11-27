package com.example.e450c.lvmama.widget;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.e450c.lvmama.R;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by e450c on 2016/11/22.
 */

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path).placeholder(R.drawable.hot_loading).into(imageView);
    }
}
