package com.hr.tvleanback.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.hr.tvleanback.ImgDatasUtils;
import com.hr.tvleanback.Presenter.ImagePresenter;
import com.hr.tvleanback.R;
import com.hr.tvleanbacklibrary.widget.ArrayObjectAdapter;
import com.hr.tvleanbacklibrary.widget.VerticalGridPresenter;

/*
 * lv   2018/8/15
 */
public class PresenterActivity extends FragmentActivity {

    private VerticalGridPresenter verticalGridPresenter;
    VerticalGridPresenter.ViewHolder mGridViewHolder;
    private ArrayObjectAdapter arrayObjectAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup view = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.activity_presenter,null,false);
        setContentView(view);

        verticalGridPresenter = new VerticalGridPresenter();

        verticalGridPresenter.setNumberOfColumns(6);
        verticalGridPresenter.setShadowEnabled(false);

        mGridViewHolder = verticalGridPresenter.onCreateViewHolder(view);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        view.addView(mGridViewHolder.view,layoutParams);

        init();
    }


    private void init(){

        arrayObjectAdapter = new ArrayObjectAdapter(new ImagePresenter());

        for(int i = 0; i< 120; i++){
            arrayObjectAdapter.add(ImgDatasUtils.getUrl());
        }

        if(null != mGridViewHolder){
            mGridViewHolder.getGridView().setVerticalSpacing(20);
            mGridViewHolder.getGridView().setHorizontalSpacing(20);

            verticalGridPresenter.onBindViewHolder(mGridViewHolder, arrayObjectAdapter);
        }
    }
}
