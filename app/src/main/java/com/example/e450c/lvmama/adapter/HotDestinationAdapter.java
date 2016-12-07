package com.example.e450c.lvmama.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.HotDestinationRVEntity;
import com.example.e450c.lvmama.widget.SmoothListView.GlideRoundTransform;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/5.
 *
 * 热门目的地recycleadapter
 */

public class HotDestinationAdapter extends RecyclerView.Adapter<HotDestinationAdapter.MyHolder> {

    private List<HotDestinationRVEntity> hotDestinationRVEntityList;

    private Context context;

    public HotDestinationAdapter(List<HotDestinationRVEntity> hotDestinationRVEntityList,Context context) {
            this.hotDestinationRVEntityList = hotDestinationRVEntityList;
            this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyHolder myHolder = new MyHolder(LayoutInflater.from(context).inflate(R.layout.item_hotdestination,null,false));
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.location_tv.setText(hotDestinationRVEntityList.get(position).getDestinationName());
        Glide.with(context).load(hotDestinationRVEntityList.get(position).getImageUrl()).transform(new GlideRoundTransform(context,10)).into(holder.location_iv);
    }

    @Override
    public int getItemCount() {
        return hotDestinationRVEntityList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.local_iv)
        ImageView location_iv;
        @BindView(R.id.local_tv)
        TextView location_tv;

        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

}
