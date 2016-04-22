package net.androidbootcamp.alohamusic;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity { //ActionBarActivity
        Button button1, button2;
        MediaPlayer mpUkulele, mpDrums;
        int playing;


        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button1= (Button)findViewById(R.id.btnUkulele);
            button2= (Button)findViewById(R.id.btnDrums);
            button1.setOnClickListener(bUkulele);
            button2.setOnClickListener(bDrums);
            mpUkulele = new MediaPlayer();
            mpUkulele = MediaPlayer.create(this,R.raw.ukulele);
            mpDrums = new MediaPlayer();
            mpDrums = MediaPlayer.create(this,R.raw.drums);
            playing = 0;
        }
        Button.OnClickListener bUkulele = new Button.OnClickListener(){
            public void onClick (View v){
                switch(playing){
                    case 0:
                        mpUkulele.start();
                        playing = 1;
                        button1.setText("Pause Ukulele Song");
                        button2.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpUkulele.pause();
                        playing = 0;
                        button1.setText("Play Ukulele Song");
                        button2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };
        Button.OnClickListener bDrums = new Button.OnClickListener(){
            public void onClick (View v){
                switch(playing){
                    case 0:
                        mpDrums.start();
                        playing = 1;
                        button1.setText("Pause Drum Song");
                        button2.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpDrums.pause();
                        playing = 0;
                        button1.setText("Play Drum Song");
                        button2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };
    }
