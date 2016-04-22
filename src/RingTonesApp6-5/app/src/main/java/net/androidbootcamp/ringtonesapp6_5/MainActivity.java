package net.androidbootcamp.ringtonesapp6_5;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends ActionBarActivity { //ActionBarActivity
        Button button1;
        MediaPlayer mpPlay;
        int playing;
        int amount = 0;
        private RadioGroup radioGroup;

        protected void onCreate (Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button1= (Button)findViewById(R.id.button1);
            button1.setOnClickListener(bPlay);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
            getSupportActionBar().setLogo(R.drawable.ic_launcher_photo);
            getSupportActionBar().setDisplayUseLogoEnabled(true);
            //final RadioButton One = (RadioButton) findViewById(R.id.radOne);
            //final RadioButton Two = (RadioButton) findViewById(R.id.radTwo);
            //final RadioButton Three = (RadioButton) findViewById(R.id.radThree);
            mpPlay = new MediaPlayer();
            mpPlay = MediaPlayer.create(this,R.raw.One);
            mpPlay = MediaPlayer.create(this,R.raw.Two);
            mpPlay = MediaPlayer.create(this,R.raw.Three);
            playing = 0;

    }
    // FIRST ATTEMPT (condense repetitive code)
    // switch was glitchy.
    Button.OnClickListener bPlay = new Button.OnClickListener(){
        //COULD ALSO USE SHOW()+ HIDE() FOR RAD.
            public void onClick (View v) {
                if (One.isChecked()) {
                    if (amount >= 1) {
                        mpPlay.start();
                        playing = 1;
                        button1.setText("Pause Song");
                    } else {
                        mpPlay.pause();
                        playing = 0;
                        button1.setText("Play Song");
                    }
                    if (Two.isChecked()) {
                        if (amount >= 1) {
                            mpPlay.start();
                            playing = 1;
                            button1.setText("Pause Song");
                        } else {
                            mpPlay.pause();
                            playing = 0;
                            button1.setText("Play Song");
                        }
                        if (Three.isChecked()) {
                            if (amount >= 1) {
                                mpPlay.start();
                                playing = 1;
                                button1.setText("Pause Song");
                            } else {
                                mpPlay.pause();
                                playing = 0;
                                button1.setText("Play Song");
                            }} }
        };
    }};}

