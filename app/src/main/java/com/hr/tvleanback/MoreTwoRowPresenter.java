package com.hr.tvleanback;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hr.tvleanbacklibrary.widget.FocusHighlight;
import com.hr.tvleanbacklibrary.widget.FocusHighlightHelper;
import com.hr.tvleanbacklibrary.widget.ItemBridgeAdapter;
import com.hr.tvleanbacklibrary.widget.ListRow;
import com.hr.tvleanbacklibrary.widget.RowPresenter;

import static android.support.v7.widget.RecyclerView.VERTICAL;

/*
 * lv   2018/8/20
 */
public class MoreTwoRowPresenter extends RowPresenter {
    @Override
    protected ViewHolder createRowViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_more_two,null,false
        );

        int w = DisplayUtils.getScreenWidth(parent.getContext())  - 80;

        view.setLayoutParams(new ViewGroup.LayoutParams(w
                ,460));

        return new ViewHolder(view);
    }

    @Override
    protected void onBindRowViewHolder(ViewHolder vh, final Object item) {
        super.onBindRowViewHolder(vh, item);

        ListRow listRow = (ListRow) item;


    }

    @Override
    protected void initializeRowViewHolder(ViewHolder vh) {
        super.initializeRowViewHolder(vh);

    }

    @Override
    protected void onUnbindRowViewHolder(ViewHolder vh) {
        super.onUnbindRowViewHolder(vh);

    }
}
