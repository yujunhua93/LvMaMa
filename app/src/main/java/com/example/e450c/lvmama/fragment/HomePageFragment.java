package com.example.e450c.lvmama.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baozi.Zxing.CaptureActivity;
import com.baozi.Zxing.ZXingConstants;

import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.activity.CityPickerActivity;
import com.example.e450c.lvmama.activity.SearchAcitivity;
import com.example.e450c.lvmama.adapter.HomepageAdapter;
import com.example.e450c.lvmama.adapter.TravelingAdapter;
import com.example.e450c.lvmama.entity.ChannelEntity;
import com.example.e450c.lvmama.entity.TravelingEntity;
import com.example.e450c.lvmama.utils.ModelUtil;
import com.example.e450c.lvmama.view.HeaderAdViewView;
import com.example.e450c.lvmama.view.HeaderBigMenuView;
import com.example.e450c.lvmama.view.HeaderChannelViewView;
import com.example.e450c.lvmama.widget.SmoothListView.SmoothListView;



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
    private static final int TAKE_PHOTO_REQUEST_CODE = 1;

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

    private HeaderAdViewView headerAdViewView;

    private HeaderBigMenuView headerBigMenuView;

    private HeaderChannelViewView headerChannelView; // 频道视图

    private SmoothListView smoothListView;

    private TravelingAdapter mAdapter;

    private HomepageAdapter homepageAdapter;

    private List<String> images;

    private List<String> adList = new ArrayList<String>();

    private List<TravelingEntity> travelingList = new ArrayList<>();

    private List<ChannelEntity> channelList = new ArrayList<>(); // 频道数据



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
            initData();




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

        // 设置广告数据
        headerAdViewView = new HeaderAdViewView(getActivity());
        headerAdViewView.fillView(adList, smoothListView);

//        headerChannelView = new HeaderChannelViewView(getActivity());
//        headerChannelView.fillView(channelList, smoothListView);


        headerBigMenuView = new HeaderBigMenuView(getActivity());
        headerBigMenuView.fillView(channelList,smoothListView);


        mAdapter = new TravelingAdapter(getActivity(), travelingList);
        smoothListView.setAdapter(mAdapter);
        smoothListView.setRefreshEnable(true);
        smoothListView.setLoadMoreEnable(true);



        return view;
    }

    private void initData() {
        adList = ModelUtil.getAdData();
//        channelList = ModelUtil.getChannelData();
        channelList =ModelUtil.getChannelData();
        travelingList = ModelUtil.getTravelingData();
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
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(getActivity(),
                    new String[]{Manifest.permission.CAMERA},
                    TAKE_PHOTO_REQUEST_CODE);
        }
        else{
            Intent intent = new Intent(getActivity(),
                    CaptureActivity.class);
            intent.putExtra(ZXingConstants.ScanIsShowHistory,true);
            startActivityForResult(intent, ZXingConstants.ScanRequestCode);
        }
    }







}
