package com.example.e450c.lvmama.fragment;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.activity.CityPickerActivity;
import com.example.e450c.lvmama.activity.SearchAcitivity;
import com.example.e450c.lvmama.adapter.HomepageAdapter;
import com.example.e450c.lvmama.adapter.TravelingAdapter;
import com.example.e450c.lvmama.entity.TravelingEntity;
import com.example.e450c.lvmama.utils.ModelUtil;
import com.example.e450c.lvmama.widget.SmoothListView.SmoothListView;
import com.uuzuche.lib_zxing.activity.CaptureActivity;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * to handle interaction events.
 * Use the {@link HomePageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomePageFragment extends Fragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    @BindView(R.id.city_homepage)
    TextView city;
    @BindView(R.id.call_homepage)
    ImageView call;
    @BindView(R.id.message_homepage)
    ImageView message;
    @BindView(R.id.QR_code)
    ImageView QRcode;

    private SmoothListView smoothListView;

    private TravelingAdapter mAdapter;

    private HomepageAdapter homepageAdapter;

    private List<String> images;

    private List<TravelingEntity> travelingList = new ArrayList<>();



    public HomePageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomePageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomePageFragment newInstance(String param1, String param2) {
        HomePageFragment fragment = new HomePageFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {





//        images = new ArrayList<>();
//        images.add("http://img4.hqbcdn.com/product/79/f3/79f3ef1b0b2283def1f01e12f21606d4.jpg");
//        images.add("http://img14.hqbcdn.com/product/77/6c/776c63e6098f05fdc5639adc96d8d6ea.jpg");
//        images.add("http://img13.hqbcdn.com/product/41/ca/41cad5139371e4eb1ce095e5f6224f4d.jpg");
//        images.add("http://img10.hqbcdn.com/product/fa/ab/faab98caca326949b87b770c8080e6cf.jpg");
//        images.add("http://img2.hqbcdn.com/product/6b/b8/6bb86086397a8cd0525c449f29abfaff.jpg");
//        homepageAdapter = new HomepageAdapter(getActivity(),images);

        View view = inflater.inflate(R.layout.fragment_home_page, container, false);

        ButterKnife.bind(this,view);
        smoothListView = (SmoothListView) view.findViewById(R.id.homepage_smoothlistview);
        travelingList = ModelUtil.getTravelingData();
        mAdapter = new TravelingAdapter(getActivity(), travelingList);
        smoothListView.setAdapter(mAdapter);
        smoothListView.setRefreshEnable(true);
        smoothListView.setLoadMoreEnable(true);

        return view;
    }




    @OnClick(R.id.city_homepage)
    public void toCity(){
            Toast.makeText(getActivity(),"点击了",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setClass(getActivity(), CityPickerActivity.class);
            startActivityForResult(intent,1);
    }

    @OnClick(R.id.search_homepage)
    public void toSearch(){
        Intent intent = new Intent();
        intent.setClass(getActivity(), SearchAcitivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.QR_code)
    public void QRcode(){
        Intent intent = new Intent(getActivity(), CaptureActivity.class);
        startActivityForResult(intent, 1);
    }







}
