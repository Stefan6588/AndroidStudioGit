package net.androidbootcamp.rentacarapp5_3;

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

public class secondpage extends ListActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            String [ ] attraction = {"Hertz","Avis","Budget","Enterprise", "ZipCar","Payles Car"};
            setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.ListView, attraction));

        }
        protected void onListItemClick(ListView l, View v, int position, long id){
            switch(position){
                case 0:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://Hertz.com")));
                    break;
                case 1:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://Avis.com" )));
                    break;
                case 2:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://Budget.com" )));
                    break;
                case 3:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://Enterprise.com" )));
                    break;
                case 4:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://Zipcar.com" )));
                    break;
                case 5:
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://Paylesscar.com" )));
                    break;
            }
        }
    }

