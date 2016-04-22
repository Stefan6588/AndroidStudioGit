package net.androidbootcamp.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_nycct1);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //String[ ] firstTime= {string1, string2, string3,string4,string5,string6};
        //setListAdapter(new ArrayAdapter<string>(this,R.layout.activity_main, R.id.first, firstTime,

        Button next = (Button) findViewById(R.id.button1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set focus to next activity (ERROR)
                //startActivity(new Intent(Main2Activity.this, Main2Activity.class));

                //could use a switch to change focus to next activity and html.
                //startActivity(new Intent.ACTION_VIEW,Uri.parse("http;//home.cunyfirst.cuny.edu");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
