package com.example.e450c.lvmama.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.HomeVirticalAdEntity;
import com.example.e450c.lvmama.widget.VirticalBannerView.BaseBannerAdapter;
import com.example.e450c.lvmama.widget.VirticalBannerView.VerticalBannerView;

import java.util.List;

/**
 * Created by e450c on 2016/12/2.
 */

public class VirticalAdAdapter extends BaseBannerAdapter<HomeVirticalAdEntity> {


    public VirticalAdAdapter(List<HomeVirticalAdEntity> datas) {
        super(datas);
    }

    @Override
    public View getView(VerticalBannerView parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.item_virticalad,null);
    }

    @Override
    public void setItem(final View view, final HomeVirticalAdEntity data) {
        TextView tag = (TextView) view.findViewById(R.id.tag);
        tag.setText(data.getFlag());
        TextView textView = (TextView) view.findViewById(R.id.virticalad_tv);
        textView.setText(data.getTitle());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //比如打开url
                Toast.makeText(view.getContext(),data.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
