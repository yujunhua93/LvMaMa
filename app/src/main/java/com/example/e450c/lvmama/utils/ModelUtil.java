package com.example.e450c.lvmama.utils;



import com.example.e450c.lvmama.R;
import com.example.e450c.lvmama.entity.FlashSaleEntity;
import com.example.e450c.lvmama.entity.HomeBigAdEntity;
import com.example.e450c.lvmama.entity.HomeBigMenuEntity;
import com.example.e450c.lvmama.entity.FilterEntity;
import com.example.e450c.lvmama.entity.FilterTwoEntity;
import com.example.e450c.lvmama.entity.HomeSmallMenuEntity;
import com.example.e450c.lvmama.entity.HomeVirticalAdEntity;
import com.example.e450c.lvmama.entity.HotDestinationEntity;
import com.example.e450c.lvmama.entity.HotDestinationRVEntity;
import com.example.e450c.lvmama.entity.HotDestinationTagEntity;
import com.example.e450c.lvmama.entity.OperationEntity;
import com.example.e450c.lvmama.entity.TravelingEntity;
import com.example.e450c.lvmama.entity.TravelingEntityComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 好吧，让你找到了，这是假的数据源
 *
 * Created by sunfusheng on 16/4/22.
 */
public class ModelUtil {

    public static final String type_scenery = "风景";
    public static final String type_building = "建筑";
    public static final String type_animal = "动物";
    public static final String type_plant = "植物";

    // 广告数据
    public static List<String> getAdData() {
        List<String> adList = new ArrayList<>();
        adList.add("http://img0.imgtn.bdimg.com/it/u=1270781761,1881354959&fm=21&gp=0.jpg");
        adList.add("http://img0.imgtn.bdimg.com/it/u=2138116966,3662367390&fm=21&gp=0.jpg");
        adList.add("http://img0.imgtn.bdimg.com/it/u=1296117362,655885600&fm=21&gp=0.jpg");
        return adList;
    }

    // 第一个大菜单数据
    public static List<HomeBigMenuEntity> getBigMenuData() {
        List<HomeBigMenuEntity> bigMenuList = new ArrayList<>();
        bigMenuList.add(new HomeBigMenuEntity("中国", "天安门", "http://img2.imgtn.bdimg.com/it/u=2850936076,2080165544&fm=206&gp=0.jpg",R.drawable.icon_big_channel_jdmp));
        bigMenuList.add(new HomeBigMenuEntity("美国", "白宫", "http://img3.imgtn.bdimg.com/it/u=524208507,12616758&fm=206&gp=0.jpg",R.drawable.icon_big_channel_zby));
        bigMenuList.add(new HomeBigMenuEntity("英国", "伦敦塔桥", "http://img3.imgtn.bdimg.com/it/u=698582197,4250615262&fm=206&gp=0.jpg",R.drawable.icon_big_channel_djjd));
        bigMenuList.add(new HomeBigMenuEntity("德国", "城堡", "http://img5.imgtn.bdimg.com/it/u=1467751238,3257336851&fm=11&gp=0.jpg",R.drawable.icon_big_channel_gny));
        bigMenuList.add(new HomeBigMenuEntity("西班牙", "巴塞罗那", "http://img5.imgtn.bdimg.com/it/u=3191365283,111438732&fm=21&gp=0.jpg",R.drawable.icon_big_channel_cjy));
        bigMenuList.add(new HomeBigMenuEntity("意大利", "比萨斜塔", "http://img5.imgtn.bdimg.com/it/u=482494496,1350922497&fm=206&gp=0.jpg",R.drawable.icon_big_channel_yl));
        bigMenuList.add(new HomeBigMenuEntity("意大利", "比萨斜塔", "http://img5.imgtn.bdimg.com/it/u=482494496,1350922497&fm=206&gp=0.jpg",R.drawable.icon_big_channel_fjp));
        bigMenuList.add(new HomeBigMenuEntity("意大利", "比萨斜塔", "http://img5.imgtn.bdimg.com/it/u=482494496,1350922497&fm=206&gp=0.jpg",R.drawable.icon_big_channel_hcp));
        return bigMenuList;
    }

    public static List<HomeSmallMenuEntity> getSmallMenuData(){
        List<HomeSmallMenuEntity> smallMenuList = new ArrayList<>();
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_qz));
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_zjy));
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_dzy));
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_zty));
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_wifi));
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_wifi));
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_qz));
        smallMenuList.add(new HomeSmallMenuEntity("","","",R.drawable.icon_small_channel_qz));
        return smallMenuList;
    }


    public static List<HomeVirticalAdEntity> getVirticalAdData(){
        List<HomeVirticalAdEntity> virticalAdList = new ArrayList<>();
        virticalAdList.add(new HomeVirticalAdEntity("抽我，快抽我！天天有惊喜！","HOT",""));
        virticalAdList.add(new HomeVirticalAdEntity("领880元新手红包，全面泡汤！","hot",""));
        virticalAdList.add(new HomeVirticalAdEntity("先领券再泡汤，全民立减880元！","new",""));;
        return  virticalAdList;

    }


    public static HomeBigAdEntity getBigAdEntity(){

        return null;
    }


    //热门目的地数据

    public static HotDestinationEntity getHotDestinationEntity(){
        HotDestinationEntity hotDestinationEntity = new HotDestinationEntity();
        List<HotDestinationRVEntity> hotDestinationRVEntityList = new ArrayList<>();
        List<HotDestinationTagEntity> hotDestinationTagEntityList = new ArrayList<>();
        hotDestinationRVEntityList.add(new HotDestinationRVEntity("大理","http://img5.imgtn.bdimg.com/it/u=2769726205,1778838650&fm=21&gp=0.jpg",""));
        hotDestinationRVEntityList.add(new HotDestinationRVEntity("拱门","http://img4.imgtn.bdimg.com/it/u=3673198446,2175517238&fm=206&gp=0.jpg",""));
        hotDestinationRVEntityList.add(new HotDestinationRVEntity("拉萨","http://img1.imgtn.bdimg.com/it/u=372954611,2699392190&fm=21&gp=0.jpg",""));
        hotDestinationRVEntityList.add(new HotDestinationRVEntity("威尔士","http://img4.imgtn.bdimg.com/it/u=2440866214,1867472386&fm=21&gp=0.jpg",""));
        hotDestinationRVEntityList.add(new HotDestinationRVEntity("自由女神像","http://img3.imgtn.bdimg.com/it/u=2566161363,1140447270&fm=206&gp=0.jpg",""));
        hotDestinationEntity.setHotDestinationRVEntityList(hotDestinationRVEntityList);

        hotDestinationTagEntityList.add(new HotDestinationTagEntity("日本",""));
        hotDestinationTagEntityList.add(new HotDestinationTagEntity("杭州",""));
        hotDestinationTagEntityList.add(new HotDestinationTagEntity("常州",""));
        hotDestinationTagEntityList.add(new HotDestinationTagEntity("黄山",""));
        hotDestinationTagEntityList.add(new HotDestinationTagEntity("更多",""));

        hotDestinationEntity.setHotDestinationTagEntity(hotDestinationTagEntityList);

        return  hotDestinationEntity;


    }


    public static List<FlashSaleEntity> getFlashSaleEntity(){
        List<FlashSaleEntity> flashSaleEntities = new ArrayList<>();
        flashSaleEntities.add(new FlashSaleEntity("6.3","http://img5.imgtn.bdimg.com/it/u=2769726205,1778838650&fm=21&gp=0.jpg","19","【春节爆款】昆明抚仙湖西双版纳（双人游）","3299","1880"));
        flashSaleEntities.add(new FlashSaleEntity("6.4","http://img4.imgtn.bdimg.com/it/u=4280994062,276434784&fm=21&gp=0.jpg","15","限时特卖，第二人立减1000元韩国首都3日游","1999","650"));
        flashSaleEntities.add(new FlashSaleEntity("6.7","http://img1.imgtn.bdimg.com/it/u=3808801622,1608105009&fm=21&gp=0.jpg","23","【12.24圣诞自助晚餐，预订即可参与超级大奖抽取】","1233","880"));
        flashSaleEntities.add(new FlashSaleEntity("3.2","http://img3.imgtn.bdimg.com/it/u=1896821840,3837942977&fm=21&gp=0.jpg","33","灵山大佛 门票+全程电子导游器（赠送3天住宿）","7800","5600"));
        flashSaleEntities.add(new FlashSaleEntity("3.7","http://img1.imgtn.bdimg.com/it/u=3436675019,2609348874&fm=206&gp=0.jpg","11","【无限次常玩水雷元温泉自由行特卖】...","3211","1199"));
        flashSaleEntities.add(new FlashSaleEntity("5.7","http://img5.imgtn.bdimg.com/it/u=2769726205,1778838650&fm=21&gp=0.jpg","9","【张家港金凤凰温泉2天1晚自由行特卖，速速来抢购啊】","199","88"));
        return flashSaleEntities;
    }

    public static List<FilterEntity> getFilterData(){
        List<FilterEntity> filterEntities = new ArrayList<>();
        filterEntities.add(new FilterEntity("1","景点门票"));
        filterEntities.add(new FilterEntity("2","周边游"));
        filterEntities.add(new FilterEntity("3","国内游"));
        filterEntities.add(new FilterEntity("4","出境游"));
        return filterEntities;
    }


    // 运营数据
    public static List<OperationEntity> getOperationData() {
        List<OperationEntity> operationList = new ArrayList<>();
        operationList.add(new OperationEntity("度假游", "度假的天堂", "http://img2.imgtn.bdimg.com/it/u=4081165325,36916497&fm=21&gp=0.jpg"));
        operationList.add(new OperationEntity("蜜月游", "浪漫的港湾", "http://img4.imgtn.bdimg.com/it/u=4141168524,78676102&fm=21&gp=0.jpg"));
        return operationList;
    }

    // ListView数据
    public static List<TravelingEntity> getTravelingData() {
        List<TravelingEntity> travelingList = new ArrayList<>();
        travelingList.add(new TravelingEntity( "天目湖御水温泉", "198", "天目湖御水温泉，华东地区具有特色的温泉度假胜地", "http://img5.imgtn.bdimg.com/it/u=2769726205,1778838650&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity(  "拙政园", "68","真不愧是世界园林的典范！很美，很漂亮！", "http://img1.imgtn.bdimg.com/it/u=1832737924,144748431&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "灵山大佛", "100","矗立在小灵山南麓", "http://img5.imgtn.bdimg.com/it/u=2091366266,1524114981&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "常州恐龙园", "40", "常州环球恐龙城是世界较大恐龙主题综合旅游度假区","http://img4.imgtn.bdimg.com/it/u=3673198446,2175517238&fm=206&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "苏州同里古镇", "80", "一时兴起来同里古镇玩", "http://img4.imgtn.bdimg.com/it/u=3052089044,3887933556&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity("银杏湖乐园", "88", "能在这么一片山清水秀的环境中有这么一个游乐场", "http://img2.imgtn.bdimg.com/it/u=140083303,1086773509&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "常州嬉戏谷", "210", "总体感觉不错。写点心得吧", "http://img5.imgtn.bdimg.com/it/u=1424970962,1243597989&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "苏州张家港金凤凰温泉", "39.9", "江苏省苏州市张家港市凤凰镇金谷路1号", "http://img4.imgtn.bdimg.com/it/u=1387833256,3665925904&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "苏州天颐温泉", "148", "江苏省苏州市吴中区越溪镇旺山生态园内", "http://img1.imgtn.bdimg.com/it/u=3808801622,1608105009&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "南京汤山颐尚温泉", "100", "江苏省南京市江宁区汤山街道温泉路8号", "http://img4.imgtn.bdimg.com/it/u=2440866214,1867472386&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "穹窿山", "68", "江苏省苏州市吴中区藏书兵圣路穹窿山麗", "http://img3.imgtn.bdimg.com/it/u=3040385967,1031044866&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity("鼋头渚", "50", "江苏省无锡市太湖鼋头渚风景区大浮镇镇充山村1号", "http://img3.imgtn.bdimg.com/it/u=1896821840,3837942977&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "天目湖山水园", "160", "江苏省常州市溧阳市环湖东路1号", "http://img3.imgtn.bdimg.com/it/u=2745651862,279304559&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "明孝陵", "27", "南京市玄武区紫金山南独龙阜玩珠峰下", "http://img3.imgtn.bdimg.com/it/u=4137420324,1489843447&fm=206&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "牛首山文化旅游区", "88", "江苏省南京市江宁区宁丹大道18号", "http://img3.imgtn.bdimg.com/it/u=2566161363,1140447270&fm=206&gp=0.jpg"));
        travelingList.add(new TravelingEntity( "常州金鹰海洋世界", "72", "江苏省常州市中心繁华商业区吊桥路25号", "http://img1.imgtn.bdimg.com/it/u=372954611,2699392190&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity("明孝陵", "27", "南京市玄武区紫金山南独龙阜玩珠峰下", "http://img0.imgtn.bdimg.com/it/u=1022702848,645282860&fm=206&gp=0.jpg"));
        travelingList.add(new TravelingEntity("拙政园", "68", "江苏省苏州市姑苏区东北街178号", "http://img1.imgtn.bdimg.com/it/u=3436675019,2609348874&fm=206&gp=0.jpg"));
        travelingList.add(new TravelingEntity("总统府", "37", "江苏省南京市玄武区东长江路292号", "http://img4.imgtn.bdimg.com/it/u=4280994062,276434784&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity("瘦西湖", "105", "江苏省扬州市邗江区大虹桥路28号（南门）", "http://img0.imgtn.bdimg.com/it/u=1644854868,3172549858&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity("常州淹城野生动物园", "170", "江苏省常州市武进区武宜南路588号", "http://img4.imgtn.bdimg.com/it/u=620137884,621556624&fm=21&gp=0.jpg"));
        travelingList.add(new TravelingEntity("红山森林动物园", "38", "江苏省南京市玄武区和燕路168号", "http://img0.imgtn.bdimg.com/it/u=3631118072,1530723002&fm=206&gp=0.jpg"));
        return travelingList;
    }

    // 分类数据
    public static List<FilterTwoEntity> getCategoryData() {
        List<FilterTwoEntity> list = new ArrayList<>();
        list.add(new FilterTwoEntity(type_scenery, getFilterData()));
        list.add(new FilterTwoEntity(type_building, getFilterData()));
        list.add(new FilterTwoEntity(type_animal, getFilterData()));
        list.add(new FilterTwoEntity(type_plant, getFilterData()));
        return list;
    }

    // 排序数据
    public static List<FilterEntity> getSortData() {
        List<FilterEntity> list = new ArrayList<>();
        list.add(new FilterEntity("排序从高到低", "1"));
        list.add(new FilterEntity("排序从低到高", "2"));
        return list;
    }

//    // 筛选数据
//    public static List<FilterEntity> getFilterData() {
//        List<FilterEntity> list = new ArrayList<>();
//        list.add(new FilterEntity("中国", "1"));
//        list.add(new FilterEntity("美国", "2"));
//        list.add(new FilterEntity("英国", "3"));
//        list.add(new FilterEntity("德国", "4"));
//        list.add(new FilterEntity("西班牙", "5"));
//        list.add(new FilterEntity("意大利", "6"));
//        return list;
//    }

//    // ListView分类数据
//    public static List<TravelingEntity> getCategoryTravelingData(FilterTwoEntity entity) {
//        List<TravelingEntity> list = getTravelingData();
//        List<TravelingEntity> travelingList = new ArrayList<>();
//        int size = list.size();
//        for (int i=0; i<size; i++) {
//            if (list.get(i).getType().equals(entity.getType()) &&
//                    list.get(i).getFrom().equals(entity.getSelectedFilterEntity().getKey())) {
//                travelingList.add(list.get(i));
//            }
//        }
//        return travelingList;
//    }

    // ListView排序数据
//    public static List<TravelingEntity> getSortTravelingData(FilterEntity entity) {
//        List<TravelingEntity> list = getTravelingData();
//        Comparator<TravelingEntity> ascComparator = new TravelingEntityComparator();
//        if (entity.getKey().equals("排序从高到低")) {
//            Collections.sort(list);
//        } else {
//            Collections.sort(list, ascComparator);
//        }
//        return list;
//    }

    // ListView筛选数据
//    public static List<TravelingEntity> getFilterTravelingData(FilterEntity entity) {
//        List<TravelingEntity> list = getTravelingData();
//        List<TravelingEntity> travelingList = new ArrayList<>();
//        int size = list.size();
//        for (int i=0; i<size; i++) {
//            if (list.get(i).getFrom().equals(entity.getKey())) {
//                travelingList.add(list.get(i));
//            }
//        }
//        return travelingList;
//    }

    // 暂无数据
    public static List<TravelingEntity> getNoDataEntity(int height) {
        List<TravelingEntity> list = new ArrayList<>();
        TravelingEntity entity = new TravelingEntity();
        entity.setNoData(true);
        entity.setHeight(height);
        list.add(entity);
        return list;
    }

}
