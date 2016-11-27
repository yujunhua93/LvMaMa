package com.example.e450c.lvmama.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.widget.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by e450c on 2016/11/22.
 */

public class HomepageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;

    private List<String> images;

    public HomepageAdapter(Context context,List<String> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder holder = null;
        switch (viewType){
            case 0:
                view = LayoutInflater.from(context).inflate(R.layout.homepage_slide,parent,false);
                holder = new SlideViewHolder(view);
                return holder;

            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.homepage_bigmenu,parent,false);
                holder = new BigMenuViewHolder(view);
                return holder;


        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case 0:
                SlideViewHolder slideViewHolder = (SlideViewHolder) holder;
                 slideViewHolder.banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
                //设置图片加载器
                slideViewHolder.banner.setImageLoader(new GlideImageLoader());
                //设置图片集合
                slideViewHolder.banner.setImages(images);
                //设置banner动画效果
                slideViewHolder.banner.setBannerAnimation(Transformer.DepthPage);
//                //设置标题集合（当banner样式有显示title时）
//                ((SlideViewHolder) holder).banner.setBannerTitles(Arrays.asList(titles));
                //设置自动轮播，默认为true
                slideViewHolder.banner.isAutoPlay(true);
                //设置轮播时间
                slideViewHolder.banner.setDelayTime(3000);
                //设置指示器位置（当banner模式中有指示器时）
                slideViewHolder.banner.setIndicatorGravity(BannerConfig.CENTER);
                //banner设置方法全部调用完毕时最后调用
                slideViewHolder.banner.start();
        }


    }

    @Override
    public int getItemCount() {
        return 100;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0){
            return  0;
        }else if (position == 1){
            return 1;
        }
        else {
            return super.getItemViewType(position);
        }

    }

    public class SlideViewHolder extends RecyclerView.ViewHolder{

        Banner banner ;

        public SlideViewHolder(View itemView) {
            super(itemView);
            banner = (Banner) itemView.findViewById(R.id.banner);
        }
    }

    public class BigMenuViewHolder extends RecyclerView.ViewHolder{

        public BigMenuViewHolder(View itemView) {
            super(itemView);
        }
    }

}
