package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.view.View;
import android.widget.ListView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.FilterEntity;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/7.
 */

public class HeaderFilterView extends HeaderViewInterface<List<FilterEntity>>{


    public HeaderFilterView(Activity context) {
        super(context);
    }

    @Override
    protected void getView(List<FilterEntity> filterEntityList, ListView listView) {
            View view = mInflate.inflate(R.layout.header_filter_layout,listView,false);
            ButterKnife.bind(this,view);
            listView.addHeaderView(view);
    }
}
