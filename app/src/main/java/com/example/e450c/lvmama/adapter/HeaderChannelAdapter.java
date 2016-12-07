package com.example.e450c.lvmama.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.HomeBigMenuEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sunfusheng on 16/4/20.
 */
public class HeaderChannelAdapter extends BaseListAdapter<HomeBigMenuEntity> {

    public HeaderChannelAdapter(Context context, List<HomeBigMenuEntity> list) {
        super(context, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_channel, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HomeBigMenuEntity entity = getItem(position);

        holder.ivImage.setImageResource(entity.getDefault_image_url());



        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.iv_image)
        ImageView ivImage;


        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
