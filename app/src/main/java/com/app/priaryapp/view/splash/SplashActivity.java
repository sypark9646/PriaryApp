package com.app.priaryapp.view.splash;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import com.app.priaryapp.R;

public class SplashActivity extends Activity {
    private final int SPLASH_TIME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, SPLASH_TIME);
    }

    @Override
    public void onBackPressed() {

    }
}
