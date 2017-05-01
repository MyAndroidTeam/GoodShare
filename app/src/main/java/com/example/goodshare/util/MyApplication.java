package com.example.goodshare.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by pc on 2017/4/29.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
