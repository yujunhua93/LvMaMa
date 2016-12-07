package com.example.e450c.lvmama.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.TravelingEntity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sunfusheng on 16/4/20.
 */
public class TravelingAdapter extends BaseListAdapter<TravelingEntity> {

    private boolean isNoData;
    private int mHeight;
    public static final int ONE_SCREEN_COUNT = 7; // 一屏能显示的个数，这个根据屏幕高度和各自的需求定
    public static final int ONE_REQUEST_COUNT = 10; // 一次请求的个数
    private Context context;

    public TravelingAdapter(Context context) {
        super(context);
    }

    public TravelingAdapter(Context context, List<TravelingEntity> list) {
        super(context, list);
        this.context = context;
    }

    // 设置数据
    public void setData(List<TravelingEntity> list) {
        clearAll();
        addALL(list);

        isNoData = false;
        if (list.size() == 1 && list.get(0).isNoData()) {
            // 暂无数据布局
            isNoData = list.get(0).isNoData();
            mHeight = list.get(0).getHeight();
        } else {
            // 添加空数据
            if (list.size() < ONE_SCREEN_COUNT) {
                addALL(createEmptyList(ONE_SCREEN_COUNT - list.size()));
            }
        }
        notifyDataSetChanged();
    }

    // 创建不满一屏的空数据
    public List<TravelingEntity> createEmptyList(int size) {
        List<TravelingEntity> emptyList = new ArrayList<>();
        if (size <= 0) return emptyList;
        for (int i=0; i<size; i++) {
            emptyList.add(new TravelingEntity());
        }
        return emptyList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 暂无数据
        if (isNoData) {
            convertView = mInflater.inflate(R.layout.item_no_data_layout, null);
            AbsListView.LayoutParams params = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, mHeight);
            RelativeLayout rootView = ButterKnife.findById(convertView, R.id.rl_root_view);
            rootView.setLayoutParams(params);
            return convertView;
        }

        // 正常数据
        final ViewHolder holder;
        if (convertView != null && convertView instanceof LinearLayout) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = mInflater.inflate(R.layout.item_travel, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        TravelingEntity entity = getItem(position);

        holder.llRootView.setVisibility(View.VISIBLE);
//        if (TextUtils.isEmpty(entity.getType())) {
//            holder.llRootView.setVisibility(View.INVISIBLE);
//            return convertView;
//        }


        holder.tvLoactionName.setText(entity.getLocation_name());
        holder.tvAbout.setText(entity.getAbout());
        Glide.with(context).load(entity.getImage_url()).into(holder.ivImage);
//        holder.tvTitle.setText(entity.getFrom() + entity.getTitle() + entity.getType());
//        holder.tvRank.setText("排名：" + entity.getRank());
        SpannableString spannableString = new SpannableString("￥"+entity.getPrice()+"起");
        spannableString.setSpan(new RelativeSizeSpan(0.5f),0,1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new RelativeSizeSpan(0.5f),entity.getPrice().length()+1,entity.getPrice().length()+2,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        holder.tvPrice.setText(spannableString);
        mImageManager.loadUrlImage(entity.getImage_url(), holder.ivImage);


        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.ll_root_view)
        LinearLayout llRootView;
        @BindView(R.id.iv_image)
        ImageView ivImage;
        @BindView(R.id.price)
        TextView tvPrice;
        @BindView(R.id.tv_about)
        TextView tvAbout;
        @BindView(R.id.tv_location_name)
        TextView tvLoactionName;
        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
