package com.wxl.paiditem;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    public static final String TAG = TestActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        if (mTimer != null){
            mTimer.start();
        }
    }

    private CountDownTimer mTimer = new CountDownTimer(20 * 1000,1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            Log.e(TAG,"mTimer.onTick()" + millisUntilFinished/1000);
        }

        @Override
        public void onFinish() {
            Log.e(TAG,"倒计时结束，mTimer.onFinish()");
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mTimer != null){
            mTimer.cancel();
        }
    }
}
