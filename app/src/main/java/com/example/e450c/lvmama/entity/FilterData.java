package com.example.e450c.lvmama.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by e450c on 2016/12/5.
 *
 */
public class FilterData implements Serializable {

    private List<FilterTwoEntity> category;
    private List<FilterEntity> sorts;
    private List<FilterEntity> filters;

    public List<FilterTwoEntity> getCategory() {
        return category;
    }

    public void setCategory(List<FilterTwoEntity> category) {
        this.category = category;
    }

    public List<FilterEntity> getSorts() {
        return sorts;
    }

    public void setSorts(List<FilterEntity> sorts) {
        this.sorts = sorts;
    }

    public List<FilterEntity> getFilters() {
        return filters;
    }

    public void setFilters(List<FilterEntity> filters) {
        this.filters = filters;
    }
}
