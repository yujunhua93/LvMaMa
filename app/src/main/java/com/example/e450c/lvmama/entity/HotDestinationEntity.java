package com.example.e450c.lvmama.entity;

import java.util.List;

/**
 * Created by e450c on 2016/12/5.
 * 热门目的地实体类
 *
 */

public class HotDestinationEntity {

    private String tagname;

    private List<HotDestinationRVEntity> hotDestinationRVEntityList;

    private  List<HotDestinationTagEntity> hotDestinationTagEntity;


    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public List<HotDestinationRVEntity> getHotDestinationRVEntityList() {
        return hotDestinationRVEntityList;
    }

    public void setHotDestinationRVEntityList(List<HotDestinationRVEntity> hotDestinationRVEntityList) {
        this.hotDestinationRVEntityList = hotDestinationRVEntityList;
    }

    public List<HotDestinationTagEntity> getHotDestinationTagEntity() {
        return hotDestinationTagEntity;
    }

    public void setHotDestinationTagEntity(List<HotDestinationTagEntity> hotDestinationTagEntity) {
        this.hotDestinationTagEntity = hotDestinationTagEntity;
    }
}
