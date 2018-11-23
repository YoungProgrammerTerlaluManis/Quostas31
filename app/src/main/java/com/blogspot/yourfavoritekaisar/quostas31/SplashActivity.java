package com.blogspot.yourfavoritekaisar.quostas31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private long ms = 0;
    private long splashtime = 3000;
    private boolean splashActive = true;
    private boolean paused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread mythread = new Thread(){
            public void run(){
                try{
                    while(splashActive && ms < splashtime){
                        if (!paused){
                            ms = ms + 100;
                            sleep(100);
                        }
                    }
                }catch (Exception e) {

                } finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        mythread.start();
    }
}
