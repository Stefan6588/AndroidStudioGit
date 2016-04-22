package net.androidbootcamp.celticsongsapp6_1;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    MediaPlayer mpJig, mpBagpipes;
    int playing;


    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button)findViewById(R.id.btnJig);
        button2= (Button)findViewById(R.id.btnBag);
        button1.setOnClickListener(bJig);
        button2.setOnClickListener(bBag);
        mpJig = new MediaPlayer();
        mpJig = MediaPlayer.create(this,R.raw.jig);
        mpBagpipes = new MediaPlayer();
        mpBagpipes = MediaPlayer.create(this,R.raw.bagpipes);
        playing = 0;
    }
    Button.OnClickListener bJig = new Button.OnClickListener(){
        public void onClick (View v){
            switch(playing){
                case 0:
                    mpJig.start();
                    playing = 1;
                    button1.setText("Pause Irish Jig");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpJig.pause();
                    playing = 0;
                    button1.setText("Play Irish Jig");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
    Button.OnClickListener bBag = new Button.OnClickListener(){
        public void onClick (View v){
            switch(playing){
                case 0:
                    mpBagpipes.start();
                    playing = 1;
                    button1.setText("Pause Bagpipes Song");
                    button2.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpBagpipes.pause();
                    playing = 0;
                    button1.setText("Play Bagpipes Song");
                    button2.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}