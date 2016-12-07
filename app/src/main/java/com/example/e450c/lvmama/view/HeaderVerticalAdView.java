package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.adapter.VirticalAdAdapter;
import com.example.e450c.lvmama.entity.HomeVirticalAdEntity;
import com.example.e450c.lvmama.widget.VirticalBannerView.VerticalBannerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/2.
 */

public class HeaderVerticalAdView extends HeaderViewInterface<List<HomeVirticalAdEntity>> {

    @BindView(R.id.homepage_virticalad_banner)
    VerticalBannerView verticalBannerView;



    public HeaderVerticalAdView(Activity context) {
        super(context);
    }

    @Override
    protected void getView(List<HomeVirticalAdEntity> homeVirticalEntities, ListView listView) {
        View view = mInflate.inflate(R.layout.header_virticalad_layout,listView,false);
        ButterKnife.bind(this,view);
        dealWithTheView(homeVirticalEntities);
        listView.addHeaderView(view);

    }

    private void dealWithTheView(List<HomeVirticalAdEntity> homeVirticalEntities) {
        VirticalAdAdapter virticalAdAdapter = new VirticalAdAdapter(homeVirticalEntities);
        verticalBannerView.setAdapter(virticalAdAdapter);
        verticalBannerView.start();

    }
}
