package net.androidbootcamp.cityguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [ ] attraction = {"Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, attraction));
            //Commnd that projects your data to the onscreen list on your device by connecting
            //the ListActivity's ListView object t0 array data
        }
        //opening the class files with a decision structure (switch)
        protected void onListItemClick(ListView l, View v, int position, long id){
            switch(position){
                case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu"))); //launching the browser
                break;
                case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com" ))); //launching the browser
                break;
                case 2:
                startActivity(new Intent(MainActivity.this, willis.class));
                break;
                case 3:
                startActivity(new Intent(MainActivity.this, Pier.class));
                break;
                case 4:
                startActivity(new Intent(MainActivity.this, Water.class));
                break;
        }

    }

}
