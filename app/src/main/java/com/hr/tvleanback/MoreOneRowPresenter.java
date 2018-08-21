package com.hr.tvleanback;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hr.tvleanbacklibrary.widget.ArrayObjectAdapter;
import com.hr.tvleanbacklibrary.widget.FocusHighlight;
import com.hr.tvleanbacklibrary.widget.FocusHighlightHandler;
import com.hr.tvleanbacklibrary.widget.FocusHighlightHelper;
import com.hr.tvleanbacklibrary.widget.ItemBridgeAdapter;
import com.hr.tvleanbacklibrary.widget.ListRow;
import com.hr.tvleanbacklibrary.widget.RowPresenter;

import static android.support.v7.widget.RecyclerView.HORIZONTAL;
import static android.support.v7.widget.RecyclerView.VERTICAL;

/*
 * lv   2018/8/16
 */
public class MoreOneRowPresenter extends RowPresenter {



    @Override
    protected ViewHolder createRowViewHolder(ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_more_one,null,false
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

        final RecyclerView recyclerView = vh.view.findViewById(R.id.recycle);

        GridLayoutManager linearLayoutManager = new GridLayoutManager(recyclerView.getContext()
                ,4,VERTICAL,false);



        linearLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {

                if(position == 0 || position == 1){
                    return 2;
                }
                return 1;
            }
        });

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addItemDecoration(new SpacesItemDecoration(20));

        final ItemBridgeAdapter itemBridgeAdapter = new ItemBridgeAdapter(){
            @Override
            protected void onBind(ViewHolder viewHolder,int point) {
                super.onBind(viewHolder);
               // Log.d(" 编号 ","---> " + point);
                if(point == 0 || point == 1){
                    viewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,200));

                }else {
                    viewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,100));
                }

            }

            @Override
            protected void onUnbind(ViewHolder viewHolder) {
                super.onUnbind(viewHolder);

            }
        };

//        ArrayObjectAdapter arrayObjectAdapter = (ArrayObjectAdapter) listRow.getAdapter();
//
//
//        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(recyclerView.getContext(),arrayObjectAdapter.getmItems());
//
//

        itemBridgeAdapter.setAdapter(listRow.getAdapter());

        FocusHighlightHelper.setupBrowseItemFocusHighlight(itemBridgeAdapter,
                FocusHighlight.ZOOM_FACTOR_XSMALL, false);

        recyclerView.setAdapter(itemBridgeAdapter);

    }

    @Override
    protected void initializeRowViewHolder(ViewHolder vh) {
        super.initializeRowViewHolder(vh);

    }
}
