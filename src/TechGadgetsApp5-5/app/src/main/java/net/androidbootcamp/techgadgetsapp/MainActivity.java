package net.androidbootcamp.techgadgetsapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [ ] attraction = {"DS", "Nvidia", "OpenPandora", "PSP 3000", "Ps Vita"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.gadgets, attraction));
        final RadioButton radOne = (RadioButton) findViewById(R.id.radOne);
        final RadioButton radTwo = (RadioButton) findViewById(R.id.radTwo);
        final RadioButton radThree = (RadioButton) findViewById(R.id.radThree);
        final RadioButton radFour = (RadioButton) findViewById(R.id.radFour);
        final RadioButton radFive = (RadioButton) findViewById(R.id.radFive);
        Button next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ///next page?

            }

    //onRadioButtonClicked
    protected void onListItemClick(ListView l, View v, int position, long id) {
        boolean checked = ((RadioButton)v).isChecked();

        switch (getListView().getId()) {
            case R.id.radOne:
                startActivity(new Intent(MainActivity.this, psp3000.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://playstation.com")));
                break;
            case R.id.radTwo:
                startActivity(new Intent(MainActivity.this, DSxl.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://nintendo.com")));
                break;
            case R.id.radThree:
                startActivity(new Intent(MainActivity.this, nvidia.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://nvidia.com")));
                break;
            case R.id.radFour:
                startActivity(new Intent(MainActivity.this, openpandora.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://openpandora.org")));
                break;
            case R.id.radFive:
                startActivity(new Intent(MainActivity.this, psvita.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://playstaion.com")));
                break;
        }
       /* public void onRadioButtonClicked(View view) {
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radOne:
                    if (checked)
                        break;
                case R.id.radTwo:
                    if (checked)
                        break;
                case R.id.radThree:
                    if (checked)
                        break;
                case R.id.radFour:
                    if (checked)
                        break;
                case R.id.radFive:
                    if (checked)
                        break;
            }*/
        }});}}