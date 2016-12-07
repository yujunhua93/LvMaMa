package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;


import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.adapter.HeaderChannelAdapter;
import com.example.e450c.lvmama.entity.HomeBigMenuEntity;

import java.util.List;


import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sunfusheng on 16/4/20.
 */
public class HeaderBigMenuView extends HeaderViewInterface<List<HomeBigMenuEntity>> {

    @BindView(R.id.gv_channel)
    GridView gvChannel;

    public HeaderBigMenuView(Activity context) {
        super(context);
    }

    @Override
    protected void getView(List<HomeBigMenuEntity> list, ListView listView) {
        View view = mInflate.inflate(R.layout.header_channel_layout, listView, false);
        ButterKnife.bind(this, view);

        dealWithTheView(list);
        listView.addHeaderView(view);
    }

    private void dealWithTheView(List<HomeBigMenuEntity> list) {
        int size = list.size();

        if (size <= 4) {
            gvChannel.setNumColumns(size);
        } else if (size == 6) {
            gvChannel.setNumColumns(3);
        } else if (size == 8) {
            gvChannel.setNumColumns(4);
        } else {
            gvChannel.setNumColumns(4);
        }

        HeaderChannelAdapter adapter = new HeaderChannelAdapter(mContext, list);
        gvChannel.setAdapter(adapter);
    }

}
