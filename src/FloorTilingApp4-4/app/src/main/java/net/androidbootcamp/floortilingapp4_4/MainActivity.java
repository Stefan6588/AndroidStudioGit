package net.androidbootcamp.floortilingapp4_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double amount = 0;
    double totalAmount;
    double OneFoot = 12;
    double Foot1point5 = 18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_const);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText txtAmount = (EditText) findViewById(R.id.txtAmount);
        final RadioButton radOne = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton radTwo = (RadioButton) findViewById(R.id.radioButton2);
        final TextView Result = (TextView) findViewById(R.id.txtResult);
        Button convert = (Button) findViewById(R.id.btnCalc);

        convert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amount = Double.parseDouble(txtAmount.getText().toString());
                DecimalFormat currency = new DecimalFormat("$###.##");

                if (radOne.isChecked()) {
                    if (amount >= 1) {
                        totalAmount = amount / OneFoot;
                        Result.setText("Area In square feet"+ currency.format(totalAmount));
                    }else {
                        Toast.makeText(MainActivity.this, "Please enter a value in Whole Sq. Ft.", Toast.LENGTH_LONG).show();
                    }
                }
                if (radTwo.isChecked()) {
                    if (amount >= 1) {
                        totalAmount = amount / Foot1point5;
                        Result.setText("Area In square feet"+ currency.format(totalAmount));
                    }else {
                        Toast.makeText(MainActivity.this, "Please enter a value in Whole Sq. Ft.", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }}