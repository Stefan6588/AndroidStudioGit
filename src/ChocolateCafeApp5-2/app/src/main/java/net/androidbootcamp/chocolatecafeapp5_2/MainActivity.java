package net.androidbootcamp.chocolatecafeapp5_2;

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
        String [ ] attraction = {"Mousse", "Macarons", "Cake"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.desserts, attraction));

    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.101cookbooks.com/desserts/")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, macarons.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, cake.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, mousse.class));
                break;
        }

    }

}
