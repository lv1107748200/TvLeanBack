package com.hr.tvleanback;


import com.hr.tvleanbacklibrary.widget.ListRowPresenter;
import com.hr.tvleanbacklibrary.widget.RowPresenter;

/*
 * lv   2018/8/15
 */
public class MoreZeroListRowPresenter extends ListRowPresenter{


    @Override
    protected void initializeRowViewHolder(RowPresenter.ViewHolder holder) {
        super.initializeRowViewHolder(holder);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.getGridView().setHorizontalSpacing(20);
        viewHolder.getGridView().setVerticalSpacing(20);
    }
}
