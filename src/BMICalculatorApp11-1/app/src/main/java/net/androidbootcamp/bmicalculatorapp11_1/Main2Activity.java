package net.androidbootcamp.bmicalculatorapp11_1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends ActionBarActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            TextView Calculate = (TextView)findViewById(R.id.txtCalculate);
            ImageView image =(ImageView) findViewById(R.id.bmi2);
            SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
            int Height= sharedPref.getInt("key1", 0);
            int Weight= sharedPref.getInt("key2", 0);
            float BMI = (float) 0.0;

            Calculate = ((Weight *703) / Height);
            DecimalFormat currency = new DecimalFormat("###.#");
            Calculate.setText("Body Mass Index:  " + currency.format(Calculate));
            if(BMI==3){
                image.setImageResource(R.drawable.ten);
            }else if(BMI==4){
                image.setImageResource(R.drawable.twenty);
            }else if(BMI==5){
                image.setImageResource(R.drawable.thirty);
            }else{
                Calculate.setText("Enter Height in Inches");
            }


        }
    }