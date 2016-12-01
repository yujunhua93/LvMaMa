package com.example.e450c.lvmama.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by sunfusheng on 16/4/21.
 */
public class FixedGirdView extends GridView {

    public FixedGirdView(Context context) {
        super(context);
    }

    public FixedGirdView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FixedGirdView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

}
