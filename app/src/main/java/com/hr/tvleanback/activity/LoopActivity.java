package com.hr.tvleanback.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import com.hr.tvleanback.ImgDatasUtils;
import com.hr.tvleanback.Presenter.ImagePaddPresenter;
import com.hr.tvleanback.R;
import com.hr.tvleanbacklibrary.widget.ArrayObjectAdapter;
import com.hr.tvleanbacklibrary.widget.FocusHighlight;
import com.hr.tvleanbacklibrary.widget.FocusHighlightHelper;
import com.hr.tvleanbacklibrary.widget.ItemBridgeAdapter;
import com.hr.tvleanbacklibrary.widget.OnChildViewHolderSelectedListener;
import com.hr.tvleanbacklibrary.widget.VerticalGridView;

/*
 * lv   2018/12/14
 */
public class LoopActivity extends FragmentActivity {

    private VerticalGridView verticalGridView;

    private ItemBridgeAdapter itemBridgeAdapter;

    private ArrayObjectAdapter arrayObjectAdapter;

    private boolean isCanBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verticalGridView = findViewById(R.id.vg);

        arrayObjectAdapter = new ArrayObjectAdapter(new ImagePaddPresenter());

        itemBridgeAdapter = new ItemBridgeAdapter(arrayObjectAdapter){
            @Override
            protected void onBind(ViewHolder viewHolder) {
                super.onBind(viewHolder);
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("TVLeanBack","点击--->");
                    }
                });
            }

            @Override
            protected void onUnbind(ViewHolder viewHolder) {
                super.onUnbind(viewHolder);
                viewHolder.itemView.setOnClickListener(null);
            }
        };

        verticalGridView.setNumColumns(6);
        verticalGridView.setColumnWidth(0);
        verticalGridView.setHorizontalSpacing(30);
        verticalGridView.setVerticalSpacing(30);

        verticalGridView.setAdapter(itemBridgeAdapter);


        verticalGridView.setOnChildViewHolderSelectedListener(new OnChildViewHolderSelectedListener() {
            @Override
            public void onChildViewHolderSelected(RecyclerView parent, RecyclerView.ViewHolder child, int position, int subposition) {
                super.onChildViewHolderSelected(parent, child, position, subposition);
                Log.d("TVLeanBack","选中--->");
            }
        });

        verticalGridView.addOnScrollListener(mOnScrollListener );

//        itemBridgeAdapter.setFocusHighlight(new FocusHighlightHandler() {
//            @Override
//            public void onItemFocused(View view, boolean hasFocus) {
//                if (hasFocus) {
//                    view.animate().scaleX(1.1f).scaleY(1.1f).start();
//                } else {
//                    view.animate().scaleX(1.0f).scaleY(1.0f).start();
//                }
//            }
//
//            @Override
//            public void onInitializeView(View view) {
//
//            }
//        });


        FocusHighlightHelper.setupBrowseItemFocusHighlight(itemBridgeAdapter,
                FocusHighlight.ZOOM_FACTOR_XSMALL, true);

        init();
    }

    private void init(){
        for(int i = 0; i< 120; i++){
            arrayObjectAdapter.add(ImgDatasUtils.getUrl());
        }
        itemBridgeAdapter.notifyDataSetChanged();
    }

    private RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int scrollState) {
            //  是否滑到顶部
            //  if(!recyclerView.canScrollVertically(-1)){
            //      Log.d("mOnScrollListener","---> 顶部判断"  );
            //      isCanBack = false;
            //  }

        }

        @Override
        public void onScrolled(RecyclerView rv, int i, int i2) {
           // Log.d("mOnScrollListener","--->" + i2 );
            if(i2 > 0){
                isCanBack = true;
            }else {
                isCanBack = false;
            }

        }

    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("onKeyDown","--->" + keyCode + isCanBack );
        switch (keyCode){
            case KeyEvent.KEYCODE_BACK:

                if(isCanBack){
                    verticalGridView.scrollToPosition(0);
                    isCanBack = false;
                    return true;
                }

                break;
        }

        return super.onKeyDown(keyCode, event);
    }

}
