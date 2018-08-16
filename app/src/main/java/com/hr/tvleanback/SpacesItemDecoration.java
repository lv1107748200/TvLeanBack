package com.hr.tvleanback;


import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/*
 * lv   2018/8/16
 */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpacesItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view,
                               RecyclerView parent, RecyclerView.State state) {


        // Add top margin only for the first item to avoid double space between items

            outRect.right = space;
            outRect.bottom = space;

//            if ((parent.getChildLayoutPosition(view) + 1) %4==0) {
//                outRect.right = 0;
//            }
    }

}
