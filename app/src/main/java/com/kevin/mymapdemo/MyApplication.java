package com.kevin.mymapdemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by Administrator on 2016/6/27 0027.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SDKInitializer.initialize(this);
    }
}
