package com.example.e450c.lvmama.listener;

import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.example.e450c.lvmama.R;

/**
 * Created by e450c on 2016/11/17.
 */

public class TabOnClickListener implements View.OnClickListener {

    private FragmentTabHost fragmentTabHost;

    private int index;

    private int[] tabImageSelectedArray;

    private int[] tabImageNoramlArray;

    public TabOnClickListener(FragmentTabHost fragmentTabHost, int index, int[] tabImageNoramlArray, int[] tabImageSelectedArray) {
        this.fragmentTabHost = fragmentTabHost;
        this.index = index;
        this.tabImageNoramlArray = tabImageNoramlArray;
        this.tabImageSelectedArray = tabImageSelectedArray;
    }


    @Override
    public void onClick(View view) {
        for (int i = 0; i < fragmentTabHost.getTabWidget().getTabCount(); i++) {
            View v = fragmentTabHost.getTabWidget().getChildAt(i);
            ImageView imageView = (ImageView) v.findViewById(R.id.act_main_tab_item_image);
            if (i == index){
                imageView.setImageResource(tabImageSelectedArray[i]);
            }else{
                imageView.setImageResource(tabImageNoramlArray[i]);
            }
            fragmentTabHost.setCurrentTab(index);
        }
    }
}
