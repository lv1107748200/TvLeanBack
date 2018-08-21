package com.hr.tvleanback;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;



/**
 * Created by 吕 on 2017/10/26.
 */

public class BaseApplation extends Application  {

    private static BaseApplation baseApp = null;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApp = this;
    }

    public static BaseApplation getBaseApp() {
        return baseApp;
    }


}
