package com.hr.tvleanback.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.hr.tvleanback.R;

/*
 * lv   2018/8/15
 */
public class SlashActivity extends FragmentActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slash);
    }

    public void Onclick(View view){
        Intent intent = new Intent();
        switch(view.getId()){
            case R.id.btn_wang:
                intent.setClass(this,MainActivity.class);
                break;
            case R.id.btn_wang_presenter:
                intent.setClass(this,PresenterActivity.class);
                break;
            case R.id.btn_wang_fenzu:
                intent.setClass(this,GroupActivity.class);
                break;
            case R.id.btn_wang_焦点:
                intent.setClass(this,LoopActivity.class);
                break;
        }

        startActivity(intent);
    }
}
