package net.androidbootcamp.bmicalculatorapp11_1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
    int Height;
    int Weight;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final EditText Height = (EditText) findViewById(R.id.Height);
         final EditText Weight = (EditText) findViewById(R.id.Weight);
        Button button = (Button) findViewById(R.id.btnCalc);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Height = Integer.parseInt(Height.getText().toString());
                Weight = Integer.parseInt(Weight.getText().toString());
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("key1", Height);
                editor.putInt("key2", Weight);
                editor.commit();
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }}
