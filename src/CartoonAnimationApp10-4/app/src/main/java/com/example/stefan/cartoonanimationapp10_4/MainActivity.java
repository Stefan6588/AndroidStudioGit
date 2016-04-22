package com.example.stefan.cartoonanimationapp10_4;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
        AnimationDrawable lightsAnimation;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ImageView imgFrame = (ImageView) findViewById(R.id.jack1);
            imgFrame.setBackgroundResource(R.drawable.animation);
            lightsAnimation = (AnimationDrawable)imgFrame.getBackground();
            Button button1 = (Button) findViewById(R.id.btnStart);
            Button button2 = (Button) findViewById(R.id.btnStop);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lightsAnimation.start();
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lightsAnimation.stop();
                }
            });

        }
    }