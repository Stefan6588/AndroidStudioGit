package net.androidbootcamp.guitarsoloapp6_4;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity { //ActionBarActivity
        Button button1;
        MediaPlayer mpPlay;
        int playing;


        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button1= (Button)findViewById(R.id.btnPlay);
            button1.setOnClickListener(bPlay);
            mpPlay = new MediaPlayer();
            mpPlay = MediaPlayer.create(this,R.raw.Layla);
            playing = 0;
        }
        Button.OnClickListener bPlay = new Button.OnClickListener(){
            public void onClick (View v){
                switch(playing){
                    case 0:
                        mpPlay.start();
                        playing = 1;
                        button1.setText("Pause Song");
                        break;
                    case 1:
                        mpPlay.pause();
                        playing = 0;
                        button1.setText("Play Song");
                        break;
                }
            }
        };
}
