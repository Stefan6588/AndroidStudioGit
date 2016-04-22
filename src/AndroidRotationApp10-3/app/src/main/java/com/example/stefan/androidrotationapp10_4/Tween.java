package com.example.stefan.androidrotationapp10_4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Tween extends AppCompatActivity {


    public class tween extends ActionBarActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tween);
            ImageView imgRotate = (ImageView)findViewById(R.id.imgTween);
            imgRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));

        }
    }
}


