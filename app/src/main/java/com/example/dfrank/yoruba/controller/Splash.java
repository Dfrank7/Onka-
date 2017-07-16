package com.example.dfrank.yoruba.controller;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.dfrank.yoruba.R;

/**
 * Created by dfrank on 6/22/17.
 */

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        TextView textView = (TextView)findViewById(R.id.splash);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        textView.startAnimation(animation);
        Thread time = new Thread(){
            public void run(){
                try {
                    TextView textView = (TextView)findViewById(R.id.splash);
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                    textView.startAnimation(animation);
                    sleep(7000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent =new Intent(Splash.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        time.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
