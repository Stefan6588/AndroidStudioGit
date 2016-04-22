package net.androidbootcamp.coffeefinderapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] attraction = {"7 Stars", "Dunkin' Doughnuts", "La Cheesecake", "Starbucks"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.coffee, attraction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainActivity.this, sevenstars.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, DunkinDoughnuts.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, LaCheesecake.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Starbucks.class));
                break;
        }
    }
}


