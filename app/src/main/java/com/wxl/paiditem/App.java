package com.wxl.paiditem;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;
import android.util.Log;

public class App extends MultiDexApplication {

    public static final String TAG = App.class.getSimpleName();

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"Application onCreate()");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.e(TAG,"Application onTerminate()");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.e(TAG,"Application onMemory()");
    }
}
