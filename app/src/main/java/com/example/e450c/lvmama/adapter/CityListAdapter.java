package com.example.e450c.lvmama.adapter;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.e450c.lvmama.entity.City;
import com.example.e450c.lvmama.entity.LocateState;
import com.example.e450c.lvmama.utils.PinyinUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by e450c on 2016/11/19.
 */

public class CityListAdapter extends BaseAdapter {

    private static final int VIEW_TYPE_COUNT = 3;

    private Context context;

    private LayoutInflater inflater;

    private List<City> mCities;

    private HashMap<String,Integer> letterIndexs;

    private String[] sections;

    private OnCityClickListener onCityClickListener;

    private int locateState  = LocateState.LOCATING;

    private String locatedCity;

    public CityListAdapter(List<City> mCities, Context context) {
        this.mCities = mCities;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        if (mCities == null ){
            mCities = new ArrayList<>();
        }
        mCities.add(0,new City("定位","0"));
        mCities.add(0,new City("热门","1"));

        //城市列表的长度
        int size = mCities.size();
        letterIndexs = new HashMap<>();
        sections = new String[size];
        for (int i = 0; i < size; i++) {
            //当前城市拼音首字母
            String currentLetter = PinyinUtils.getFirstLetter(mCities.get(i).getPinyin());
            //
            String previousLetter  = i >=1  ?PinyinUtils.getFirstLetter(mCities.get(i-1).getPinyin()):"";

            if (!TextUtils.equals(currentLetter,previousLetter)){
                letterIndexs.put(currentLetter,i);
                sections[i] = currentLetter;
            }





        }

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }


    public interface  OnCityClickListener{

    }

}
