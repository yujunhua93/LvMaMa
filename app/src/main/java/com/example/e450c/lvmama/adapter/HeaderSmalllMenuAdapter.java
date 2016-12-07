package com.example.e450c.lvmama.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.HomeBigMenuEntity;
import com.example.e450c.lvmama.entity.HomeSmallMenuEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/2.
 */

public class HeaderSmalllMenuAdapter extends RecyclerView.Adapter<HeaderSmalllMenuAdapter.MyViewHolder>{

    private List<HomeSmallMenuEntity> list;

    private Context context;

    public HeaderSmalllMenuAdapter(Context context,List<HomeSmallMenuEntity> list) {
            this.context = context;
            this.list = list;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_smallmenu,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.smallMenuView.setImageResource(list.get(position).getDefault_image_url());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends  RecyclerView.ViewHolder{
        @BindView(R.id.smallmenu_iv)
        ImageView smallMenuView;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
