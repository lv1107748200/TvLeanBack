package com.hr.tvleanback.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.hr.tvleanback.ImgDatasUtils;
import com.hr.tvleanback.MainPresenterSelector;
import com.hr.tvleanback.Presenter.ImagePresenter;
import com.hr.tvleanback.R;
import com.hr.tvleanbacklibrary.widget.ArrayObjectAdapter;
import com.hr.tvleanbacklibrary.widget.HeaderItem;
import com.hr.tvleanbacklibrary.widget.ItemBridgeAdapter;
import com.hr.tvleanbacklibrary.widget.ListRow;
import com.hr.tvleanbacklibrary.widget.VerticalGridView;

/*
 * lv   2018/8/15
 */
public class GroupActivity extends FragmentActivity {


    private VerticalGridView verticalGridView;

    private ItemBridgeAdapter itemBridgeAdapter;

    private ArrayObjectAdapter arrayObjectAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenzu);

        verticalGridView = findViewById(R.id.vg);

        arrayObjectAdapter = new ArrayObjectAdapter();
        itemBridgeAdapter = new ItemBridgeAdapter(arrayObjectAdapter,new MainPresenterSelector());

        verticalGridView.setAdapter(itemBridgeAdapter);
        init();
    }


    private void init(){

        for(int j = 0; j<5; j++){
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new ImagePresenter());
            for(int i = 0; i< 10; i++){
                arrayObjectAdapter.add(ImgDatasUtils.getUrl());
            }

            ListRow listRow = new ListRow(new HeaderItem("title : more"+j),arrayObjectAdapter);
            listRow.setContentDescription("more"+j);

            this.arrayObjectAdapter.add(listRow);
        }

        itemBridgeAdapter.notifyDataSetChanged();
    }
}
