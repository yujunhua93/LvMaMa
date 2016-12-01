package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.adapter.HeaderChannelAdapter;
import com.example.e450c.lvmama.entity.ChannelEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by e450c on 2016/12/1.
 */

public class HeaderBigMenuView extends HeaderViewInterface<List<ChannelEntity>> {

    @BindView(R.id.homepage_bigmenu_gv)
    FixedGirdView gvChannel;
    public HeaderBigMenuView(Activity context) {
        super(context);
    }

    @Override
    protected void getView(List<ChannelEntity> list, ListView listView) {
        View view = mInflate.inflate(R.layout.homepage_bigmenu, listView, false);
        ButterKnife.bind(this,view);
        dealWithTheView(list);
        listView.addHeaderView(view);
    }



    private void dealWithTheView(List<ChannelEntity> list) {

        gvChannel.setNumColumns(4);
        HeaderChannelAdapter adapter = new HeaderChannelAdapter(mContext, list);
        gvChannel.setAdapter(adapter);
    }
}
