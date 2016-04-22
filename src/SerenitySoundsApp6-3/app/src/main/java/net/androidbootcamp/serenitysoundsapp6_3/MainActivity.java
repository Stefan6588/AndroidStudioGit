package net.androidbootcamp.serenitysoundsapp6_3;

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
        MediaPlayer mpDramatic, mpMysterious;
        int playing;


        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button1= (Button)findViewById(R.id.btnOne);
            button2= (Button)findViewById(R.id.btnTwo);
            button1.setOnClickListener(bDramatic);
            button2.setOnClickListener(bMysterious);
            mpDramatic = new MediaPlayer();
            mpDramatic = MediaPlayer.create(this,R.raw.Dramatic);
            mpMysterious = new MediaPlayer();
            mpMysterious = MediaPlayer.create(this,R.raw.Mysterious);
            playing = 0;
        }
        Button.OnClickListener bDramatic = new Button.OnClickListener(){
            public void onClick (View v){
                switch(playing){
                    case 0:
                        mpDramatic.start();
                        playing = 1;
                        button1.setText("Pause Dramatic Music");
                        button2.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpDramatic.pause();
                        playing = 0;
                        button1.setText("Play Dramatic Music");
                        button2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };
        Button.OnClickListener bMysterious = new Button.OnClickListener(){
            public void onClick (View v){
                switch(playing){
                    case 0:
                        mpMysterious.start();
                        playing = 1;
                        button1.setText("Pause Mysterious Music");
                        button2.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        mpMysterious.pause();
                        playing = 0;
                        button1.setText("Play Mysterious Music");
                        button2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        };
    }
