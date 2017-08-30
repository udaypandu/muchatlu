package com.nevexa.muchatlu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import utility.Constants;

public class SplashActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme_NoActionBar);
        setContentView(R.layout.activity_splash);

        Handler mSplashHandler = new Handler();
        Runnable action = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        mSplashHandler.postDelayed(action, Constants.SPLASH_TIME_OUT);


}
}
