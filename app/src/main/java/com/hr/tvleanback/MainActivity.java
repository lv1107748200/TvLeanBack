package com.hr.tvleanback;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.hr.tvleanbacklibrary.widget.ArrayObjectAdapter;
import com.hr.tvleanbacklibrary.widget.FocusHighlight;
import com.hr.tvleanbacklibrary.widget.FocusHighlightHandler;
import com.hr.tvleanbacklibrary.widget.FocusHighlightHelper;
import com.hr.tvleanbacklibrary.widget.ItemBridgeAdapter;
import com.hr.tvleanbacklibrary.widget.OnChildSelectedListener;
import com.hr.tvleanbacklibrary.widget.OnChildViewHolderSelectedListener;
import com.hr.tvleanbacklibrary.widget.VerticalGridView;

public class MainActivity extends FragmentActivity {

    private VerticalGridView verticalGridView;

    private ItemBridgeAdapter itemBridgeAdapter;

    private ArrayObjectAdapter arrayObjectAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verticalGridView = findViewById(R.id.vg);

        arrayObjectAdapter = new ArrayObjectAdapter(new ImagePresenter());

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
        verticalGridView.setHorizontalSpacing(20);
        verticalGridView.setVerticalSpacing(20);

        verticalGridView.setAdapter(itemBridgeAdapter);


        verticalGridView.setOnChildViewHolderSelectedListener(new OnChildViewHolderSelectedListener() {
            @Override
            public void onChildViewHolderSelected(RecyclerView parent, RecyclerView.ViewHolder child, int position, int subposition) {
                super.onChildViewHolderSelected(parent, child, position, subposition);
                Log.d("TVLeanBack","选中--->");
            }
        });

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
                FocusHighlight.ZOOM_FACTOR_XSMALL, false);

        init();
    }

    private void init(){
        for(int i = 0; i< 120; i++){
            arrayObjectAdapter.add(ImgDatasUtils.getUrl());
        }
        itemBridgeAdapter.notifyDataSetChanged();
    }
}
