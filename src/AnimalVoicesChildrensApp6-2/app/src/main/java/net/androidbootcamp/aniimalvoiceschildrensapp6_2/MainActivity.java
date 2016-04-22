package net.androidbootcamp.aniimalvoiceschildrensapp6_2;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity { //ActionBarActivity
    Button button1, button2;
    MediaPlayer mpCows, mpPigs;
    int playing;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button)findViewById(R.id.btnCows);
        button2= (Button)findViewById(R.id.btnPigs);
        button1.setOnClickListener(bCows);
        button2.setOnClickListener(bPigs);
        mpCows = new MediaPlayer();
        mpCows = MediaPlayer.create(this,R.raw.cows);
        mpPigs = new MediaPlayer();
        mpPigs = MediaPlayer.create(this,R.raw.pigs);
        playing = 0;
    }
    Button.OnClickListener bCows = new Button.OnClickListener(){
        public void onClick (View v){
            switch(playing){
                case 0:
                    mpCows.start();
                    playing = 1;
                    button1.setText("Pause Cow Sound");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpCows.pause();
                    playing = 0;
                    button1.setText("Play Pig Sound");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
    Button.OnClickListener bPigs = new Button.OnClickListener(){
        public void onClick (View v){
            switch(playing){
                case 0:
                    mpPigs.start();
                    playing = 1;
                    button1.setText("Pause Pig Sound");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpPigs.pause();
                    playing = 0;
                    button1.setText("Play Pig Sound");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };}