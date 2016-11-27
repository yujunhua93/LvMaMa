package com.example.e450c.lvmama.activity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.fragment.DestinationFragment;
import com.example.e450c.lvmama.fragment.HomePageFragment;
import com.example.e450c.lvmama.fragment.PeripheryFragment;
import com.example.e450c.lvmama.fragment.SaleFragment;
import com.example.e450c.lvmama.fragment.UserFragment;
import com.example.e450c.lvmama.listener.TabOnClickListener;
import com.example.e450c.lvmama.widget.MainTab;

/**
 * yjh
 * 2016/11/17
 */


public class MainActivity extends AppCompatActivity implements TabHost.OnTabChangeListener{

    private FragmentTabHost mTabHost;
    private CharSequence mTitle; // tab的底部文字
    private String[] mTitles;
    private LayoutInflater layoutInflater;


    private Class[] tabFragmentArray = {HomePageFragment.class, SaleFragment.class,
            DestinationFragment.class, PeripheryFragment.class, UserFragment.class};
    private int[] tabStringArray = {R.string.act_main_tab_string_home,R.string.act_main_tab_string_sale, R.string.act_main_tab_string_destination, R.string.act_main_tab_string_periphery,R.string.act_main_tab_string_user};


    private int[] tabImageNoramlArray = {
            R.drawable.tab_1_normal,R.drawable.tab_2_normal,
            R.drawable.tab_3_normal,R.drawable.tab_4_normal,
            R.drawable.tab_5_normal};
    private int[] tabImageSelectedArray = {
            R.drawable.tab_1_pressed,R.drawable.tab_2_pressed,
            R.drawable.tab_3_pressed,R.drawable.tab_4_pressed,
            R.drawable.tab_5_pressed};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        mTabHost = (FragmentTabHost) findViewById(R.id.act_main_tab_host);
        mTabHost.setup(this,getSupportFragmentManager(),R.id.content);
        if (Build.VERSION.SDK_INT >10){
              mTabHost.getTabWidget().setShowDividers(0);
        }
        initTabs();
        mTabHost.setCurrentTab(0);

        mTabHost.setOnTabChangedListener(this);

    }

    private void initTabs() {

        int size = tabStringArray.length;
        for (int i = 0; i < size; i++) {
            TabHost.TabSpec tabSpec ;
            if (i == 0){
                    tabSpec = mTabHost.newTabSpec(getResources().getString(tabStringArray[i])).setIndicator(getTabItemView(tabImageSelectedArray[i]));
            }else{
                    tabSpec = mTabHost.newTabSpec(getResources().getString(tabStringArray[i])).setIndicator(getTabItemView(tabImageNoramlArray[i]));
            }
            //给tabspec添加fragment
            mTabHost.addTab(tabSpec,tabFragmentArray[i],null);
            mTabHost.getTabWidget().getChildTabViewAt(i).setOnClickListener(new TabOnClickListener(mTabHost,i,tabImageNoramlArray,tabImageSelectedArray));

        }
//        for (int i = 0; i < size; i++) {
//            MainTab mainTab = tabs[i];
//            TabHost.TabSpec tab = mTabHost.newTabSpec(getString(mainTab.getResName()) + this.toString());
//            View indicator = View.inflate(this, R.layout.item_main_menu_tab, null);
//
//            ImageView icon = (ImageView) indicator.findViewById(R.id.iv_user_flow_icon);
//
//            Drawable drawable = this.getResources().getDrawable(mainTab.getResIcon());
//            icon.setImageDrawable(drawable);
//
//
//            tab.setIndicator(indicator);
//            mTabHost.addTab(tab, mainTab.getClz(), null);
////            mTabHost.getTabWidget().getChildAt(i).setOnTouchListener(this);
//
//        }

    }

    private View getTabItemView(int imageResId) {
        layoutInflater = LayoutInflater.from(this);
        View view = layoutInflater.inflate(R.layout.item_main_menu_tab,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.act_main_tab_item_image);

        imageView.setImageResource(imageResId);

        return view;
    }

//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        super.onTouchEvent(motionEvent);
//        boolean consumed = false;
//        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN
//                && view.equals(mTabHost.getCurrentTabView())) {
//            Fragment currentFragment = getCurrentFragment();
//            if (currentFragment != null
//                    && currentFragment instanceof OnTabReselectListener) {
//                OnTabReselectListener listener = (OnTabReselectListener) currentFragment;
//                listener.onTabReselect();
//                consumed = true;
//            }
//        }
//        return consumed;
//
//
//    }

    @Override
    public void onTabChanged(String s) {
        final int size = mTabHost.getTabWidget().getTabCount();
        for (int i = 0; i < size; i++) {
            View v = mTabHost.getTabWidget().getChildAt(i);
            if (i == mTabHost.getCurrentTab()) {
                v.setSelected(true);

            } else {
                v.setSelected(false);
            }
        }
        supportInvalidateOptionsMenu();
    }

//    private Fragment getCurrentFragment() {
//        return getSupportFragmentManager().findFragmentByTag(
//                mTabHost.getCurrentTabTag());
//    }
}
