package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.adapter.HeaderSmalllMenuAdapter;
import com.example.e450c.lvmama.entity.HomeBigMenuEntity;
import com.example.e450c.lvmama.entity.HomeSmallMenuEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/2.
 */

public class HeadSmallMenuView  extends HeaderViewInterface<List<HomeSmallMenuEntity>>{

    @BindView(R.id.homepage_smallmenu_rv)
    RecyclerView smallMenuRv;

    private Context context;

    public HeadSmallMenuView(Activity context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void getView(List<HomeSmallMenuEntity> strings, ListView listView) {

            View view = mInflate.inflate(R.layout.header_smallmenu_layout,listView,false);
            ButterKnife.bind(this,view);
            dealWithTheView(strings);
            listView.addHeaderView(view);

    }

    private void dealWithTheView(List<HomeSmallMenuEntity> list) {

        HeaderSmalllMenuAdapter headerSmalllMenuAdapter = new HeaderSmalllMenuAdapter(context,list);
        smallMenuRv.setLayoutManager(new GridLayoutManager(context,4));
        smallMenuRv.setAdapter(headerSmalllMenuAdapter);
    }
}
