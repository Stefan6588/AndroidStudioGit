package net.androidbootcamp.celticsongsapp6_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
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
            opening.schedule(task,4000);

        }
    }
