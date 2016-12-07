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
 * Created by e450c on 2016/12/5.
 */

public class HeaderFindMoreView extends HeaderViewInterface<String> {





    public HeaderFindMoreView(Activity context) {
        super(context);
    }

    @Override
    protected void getView(String string, ListView listView) {
        View view = mInflate.inflate(R.layout.header_findmore_layout,listView,false);
        ButterKnife.bind(this,view);

        listView.addHeaderView(view);

    }


}
