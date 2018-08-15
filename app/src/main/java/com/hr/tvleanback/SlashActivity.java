package com.hr.tvleanback;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

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
        }

        startActivity(intent);
    }
}
