package com.wxl.paiditem.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wxl.paiditem.R;

public class SplashActivity extends AppCompatActivity {

    public static final String TAG = SplashActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
