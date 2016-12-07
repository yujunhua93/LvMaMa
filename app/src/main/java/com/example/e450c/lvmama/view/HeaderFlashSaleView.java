package com.example.e450c.lvmama.view;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.adapter.FlashSaleAdapter;
import com.example.e450c.lvmama.adapter.VirticalAdAdapter;
import com.example.e450c.lvmama.entity.FlashSaleEntity;
import com.example.e450c.lvmama.entity.HomeVirticalAdEntity;
import com.example.e450c.lvmama.widget.DragFooterView.DragContainer;
import com.example.e450c.lvmama.widget.DragFooterView.NormalFooterDrawer;
import com.example.e450c.lvmama.widget.VirticalBannerView.VerticalBannerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by e450c on 2016/12/5.
 */

public class HeaderFlashSaleView extends HeaderViewInterface<List<FlashSaleEntity>> {

    @BindView(R.id.home_flashsale_rv)
    RecyclerView home_flashsale_rv;

    @BindView(R.id.dragcontainer_flashsale)
    DragContainer dragContainer;


    private Context context;

    public HeaderFlashSaleView(Activity context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void getView(List<FlashSaleEntity> homeflashSaleEntity, ListView listView) {
        View view = mInflate.inflate(R.layout.header_flashsale_layout,listView,false);
        ButterKnife.bind(this,view);
        dealWithTheView(homeflashSaleEntity);
        listView.addHeaderView(view);

    }

    private void dealWithTheView(List<FlashSaleEntity> homeflashSaleEntity) {
        FlashSaleAdapter flashSaleAdapter = new FlashSaleAdapter(homeflashSaleEntity,context);
        home_flashsale_rv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        home_flashsale_rv.setAdapter(flashSaleAdapter);

    }
}
