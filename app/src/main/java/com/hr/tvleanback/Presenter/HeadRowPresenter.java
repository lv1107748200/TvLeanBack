package com.hr.tvleanback.Presenter;


import android.graphics.Color;

import com.hr.tvleanbacklibrary.widget.Presenter;
import com.hr.tvleanbacklibrary.widget.RowHeaderPresenter;
import com.hr.tvleanbacklibrary.widget.RowHeaderView;

/*
 * lv   2018/8/15
 */
public class HeadRowPresenter extends RowHeaderPresenter {

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        super.onBindViewHolder(viewHolder, item);
        RowHeaderView    mTitleView = (RowHeaderView)viewHolder.view.
                findViewById(com.hr.tvleanbacklibrary.R.id.row_header);

        mTitleView.setTextSize(25);
        mTitleView.setTextColor(Color.RED);
    }
}
