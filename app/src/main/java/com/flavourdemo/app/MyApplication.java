package com.flavourdemo.app;

import android.app.Application;

import com.flavourdemo.BuildConfig;


public class MyApplication extends Application {

    private String baseUrl;
    private static MyApplication appInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        appInstance = this;
        baseUrl = BuildConfig.HOST_URL;
    }

    public static MyApplication getAppInstance() {
        return appInstance;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }



}
