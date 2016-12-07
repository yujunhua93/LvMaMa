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
import android.widget.AbsListView;
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
import com.example.e450c.lvmama.entity.FilterEntity;
import com.example.e450c.lvmama.entity.FlashSaleEntity;
import com.example.e450c.lvmama.entity.HomeBigAdEntity;
import com.example.e450c.lvmama.entity.HomeBigMenuEntity;
import com.example.e450c.lvmama.entity.HomeSmallMenuEntity;
import com.example.e450c.lvmama.entity.HomeVirticalAdEntity;
import com.example.e450c.lvmama.entity.HotDestinationEntity;
import com.example.e450c.lvmama.entity.TravelingEntity;
import com.example.e450c.lvmama.utils.DensityUtil;
import com.example.e450c.lvmama.utils.ModelUtil;
import com.example.e450c.lvmama.view.HeadSmallMenuView;
import com.example.e450c.lvmama.view.HeaderAdViewView;
import com.example.e450c.lvmama.view.HeaderBigAdView;
import com.example.e450c.lvmama.view.HeaderBigMenuView;
import com.example.e450c.lvmama.view.HeaderExclusiveView;
import com.example.e450c.lvmama.view.HeaderFilterView;
import com.example.e450c.lvmama.view.HeaderFindMoreView;
import com.example.e450c.lvmama.view.HeaderFlashSaleView;
import com.example.e450c.lvmama.view.HeaderHotRecommendView;
import com.example.e450c.lvmama.view.HeaderVerticalAdView;
import com.example.e450c.lvmama.view.HeaderHotDestinationView;
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

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final int TAKE_PHOTO_REQUEST_CODE = 1;


    private String mParam1;
    private String mParam2;

    @BindView(R.id.homepage_smoothlistview)
    SmoothListView smoothListView;

    @BindView(R.id.city_homepage)
    TextView city;
    @BindView(R.id.call_homepage)
    ImageView call;
    @BindView(R.id.message_homepage)
    ImageView message;
    @BindView(R.id.QR_code)
    ImageView QRcode;

    @BindView(R.id.homepage_movetotop)
    ImageView moveToTop_iv;

    private HeaderAdViewView headerAdViewView;

    private HeaderBigMenuView headerBigMenuView;

    private HeadSmallMenuView headSmallMenuView;

    private HeaderVerticalAdView headerVerticalAdView;

    private HeaderBigAdView headerBigAdView;

    private HeaderHotDestinationView headerHotDestinationView;

    private HeaderHotRecommendView headerHotRecommendView;

    private HeaderExclusiveView headerExclusiveView;

    private HeaderFlashSaleView headerFlashSaleView;

    private HeaderFindMoreView headerFindMoreView;

    private HeaderFilterView headerFilterView;

    private View itemHeaderAdView; // 从ListView获取的广告子View

    private View itemHeaderFilterView; // 从ListView获取的筛选子View

    private int filterViewTopSpace; // 筛选视图距离顶部的距离

    private int adViewTopSpace; // 广告视图距离顶部的距离

    private int adViewHeight = 180; // 广告视图的高度

    private int titleViewHeight = 50; // 标题栏的高度

    private TravelingAdapter mAdapter;

    private HomepageAdapter homepageAdapter;

    private List<String> images;

    private List<String> adList = new ArrayList<String>();

    private List<TravelingEntity> travelingList = new ArrayList<>();

    private List<HomeBigMenuEntity> bigMenuList = new ArrayList<>(); // 数据

    private List<HomeSmallMenuEntity> smallMenuList = new ArrayList<>();

    private List<HomeVirticalAdEntity> virticalAdList = new ArrayList<>();//垂直滚动数据

    private List<FlashSaleEntity> flashSaleList = new ArrayList<>();

    private List<FilterEntity> filterList = new ArrayList<>();

    private HomeBigAdEntity bigadList = null;//大幅广告栏

    private HotDestinationEntity hotDestinationEntity ;//热门目的地数据

    private int filterlayoutPosition = 0;

    public HomePageFragment() {
        // Required empty public constructor
    }

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

//        smoothListView = (SmoothListView) view.findViewById(R.id.homepage_smoothlistview);

        // 设置广告数据
        headerAdViewView = new HeaderAdViewView(getActivity());
        headerAdViewView.fillView(adList, smoothListView);

        //设置顶部大menu
        headerBigMenuView = new HeaderBigMenuView(getActivity());
        headerBigMenuView.fillView(bigMenuList,smoothListView);

        //设置顶面小menu
        headSmallMenuView = new HeadSmallMenuView(getActivity());
        headSmallMenuView.fillView(smallMenuList,smoothListView);

        //设置垂直滚动广告
        headerVerticalAdView = new HeaderVerticalAdView(getActivity());
        headerVerticalAdView.fillView(virticalAdList,smoothListView);

        //设置大广告
        headerBigAdView = new HeaderBigAdView(getActivity());
        headerBigAdView.fillView(bigadList,smoothListView);

        //热门目的地
        headerHotDestinationView = new HeaderHotDestinationView(getActivity());
        headerHotDestinationView.fillView(hotDestinationEntity,smoothListView);

        //热门推荐
        headerHotRecommendView = new HeaderHotRecommendView(getActivity());
        headerHotRecommendView.fillView(virticalAdList,smoothListView);

        //手机专享
        headerExclusiveView = new HeaderExclusiveView(getActivity());
        headerExclusiveView.fillView(virticalAdList,smoothListView);

        //时限抢购
        headerFlashSaleView = new HeaderFlashSaleView(getActivity());
        headerFlashSaleView.fillView(flashSaleList,smoothListView);

        //发现更多
        headerFindMoreView = new HeaderFindMoreView(getActivity());
        headerFindMoreView.fillView("",smoothListView);

        //过滤菜单
        headerFilterView = new HeaderFilterView(getActivity());
        headerFilterView.fillView(filterList,smoothListView);

        filterlayoutPosition = smoothListView.getHeaderViewsCount()-1;


        mAdapter = new TravelingAdapter(getActivity(), travelingList);
        smoothListView.setAdapter(mAdapter);
        smoothListView.setRefreshEnable(true);
        smoothListView.setLoadMoreEnable(true);

        smoothListView.setOnScrollListener(new SmoothListView.OnSmoothScrollListener() {
            @Override
            public void onSmoothScrolling(View view) {

            }

            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (itemHeaderAdView == null){
                    itemHeaderAdView = smoothListView.getChildAt(1-firstVisibleItem);
                }
                if (itemHeaderAdView != null) {
                    adViewTopSpace = DensityUtil.px2dip(getActivity(), itemHeaderAdView.getTop());
                    adViewHeight = DensityUtil.px2dip(getActivity(), itemHeaderAdView.getHeight());
                }

                // 获取筛选View、距离顶部的高度
                if (itemHeaderFilterView == null) {
                    itemHeaderFilterView = smoothListView.getChildAt(filterlayoutPosition - firstVisibleItem);
                }
                if (itemHeaderFilterView != null) {
                    filterViewTopSpace = DensityUtil.px2dip(getActivity(), itemHeaderFilterView.getTop());
                }


                // 处理筛选是否吸附在顶部
                //否
                if (filterViewTopSpace > titleViewHeight) {
                    moveToTop_iv.setVisibility(View.GONE);
                } else {
                    moveToTop_iv.setVisibility(View.VISIBLE);
                }


            }
        });

        return view;
    }

    private void initData() {
        adList = ModelUtil.getAdData();
        bigMenuList =ModelUtil.getBigMenuData();
        smallMenuList = ModelUtil.getSmallMenuData();
        travelingList = ModelUtil.getTravelingData();
        virticalAdList = ModelUtil.getVirticalAdData();
        bigadList = ModelUtil.getBigAdEntity();
        flashSaleList = ModelUtil.getFlashSaleEntity();
        filterList = ModelUtil.getFilterData();
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

    @OnClick(R.id.homepage_movetotop)
    public void moveToTop(){
        smoothListView.smoothScrollToPosition(0);
    }







}
