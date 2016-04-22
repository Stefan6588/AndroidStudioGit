package net.androidbootcamp.mountainbikerentals5_1;

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
            String [ ] attraction = {"Beach Bike Rentals","Mountain Bike Rentals"};
            setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.rental, attraction));

        }
        protected void onListItemClick(ListView l, View v, int position, long id){
            switch(position){
                case 0:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://campusbikeshop.com" )));
                    break;
                case 1:
                    startActivity(new Intent(MainActivity.this, mountain.class));
                    break;
                case 2:
                    startActivity(new Intent(MainActivity.this, beach.class));
                    break;
            }

        }
    }
