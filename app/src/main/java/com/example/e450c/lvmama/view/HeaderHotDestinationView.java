package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.adapter.HotDestinationAdapter;
import com.example.e450c.lvmama.entity.HotDestinationEntity;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/5.
 *
 * 热门目的地
 */

public class HeaderHotDestinationView extends HeaderViewInterface<HotDestinationEntity>{

    @BindView(R.id.hot_destination_rv)
    RecyclerView hot_destination_rv;

    @BindView(R.id.hot_destination_tag1)
    TextView tag1;

    @BindView(R.id.hot_destination_tag2)
    TextView tag2;

    @BindView(R.id.hot_destination_tag3)
    TextView tag3;

    @BindView(R.id.hot_destination_tag4)
    TextView tag4;

    @BindView(R.id.hot_destination_tagmore)
    TextView tagMore;

    private Context context;

    public HeaderHotDestinationView(Activity context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void getView(HotDestinationEntity hotDestinationEntity, ListView listView) {
        View view = mInflate.inflate(R.layout.hot_destination_layout,listView,false);
        ButterKnife.bind(this,view);
        dealWithTheView(hotDestinationEntity);
        listView.addHeaderView(view);

    }

    private void dealWithTheView(HotDestinationEntity hotDestinationEntity) {

        HotDestinationAdapter hotDestinationAdapter = new HotDestinationAdapter(hotDestinationEntity.getHotDestinationRVEntityList(),context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        hot_destination_rv.setLayoutManager(linearLayoutManager);
        hot_destination_rv.setAdapter(hotDestinationAdapter);

        tag1.setText(hotDestinationEntity.getHotDestinationTagEntity().get(0).getTagName());
        tag2.setText(hotDestinationEntity.getHotDestinationTagEntity().get(1).getTagName());
        tag3.setText(hotDestinationEntity.getHotDestinationTagEntity().get(2).getTagName());
        tag4.setText(hotDestinationEntity.getHotDestinationTagEntity().get(3).getTagName());
        tagMore.setText(hotDestinationEntity.getHotDestinationTagEntity().get(4).getTagName());


    }
}
