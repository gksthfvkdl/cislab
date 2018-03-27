package com.example.administrator.lbs;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Administrator on 2018-03-27.
 * 작업 시작
 * 기존 메인화면날림
 */

public class LoadingActivity extends Activity{
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        
        startLoading();
    }

    private void startLoading() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               finish();
            }
        }, 2500);
    }
}
