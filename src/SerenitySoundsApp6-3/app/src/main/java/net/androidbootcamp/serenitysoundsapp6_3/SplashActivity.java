package net.androidbootcamp.serenitysoundsapp6_3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            TimerTask task = new TimerTask(){
                public void run(){
                    finish();
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
            };
            Timer opening = new Timer();
            opening.schedule(task,5000);

        }
    }
