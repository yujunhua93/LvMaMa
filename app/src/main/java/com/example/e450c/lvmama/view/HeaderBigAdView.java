package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.HomeBigAdEntity;
import com.example.e450c.lvmama.widget.VirticalBannerView.BaseBannerAdapter;
import com.example.e450c.lvmama.widget.VirticalBannerView.VerticalBannerView;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/4.
 */

public class HeaderBigAdView extends HeaderViewInterface<HomeBigAdEntity> {


    public HeaderBigAdView(Activity context) {
        super(context);
    }

    @Override
    protected void getView(HomeBigAdEntity homeBigAdEntity, ListView listView) {
        View view = mInflate.inflate(R.layout.header_bigad_layout,listView,false);
        ButterKnife.bind(this,view);
        dealWithTheView(homeBigAdEntity);
        listView.addHeaderView(view);
    }

    private void dealWithTheView(HomeBigAdEntity homeBigAdEntity) {


    }


}
