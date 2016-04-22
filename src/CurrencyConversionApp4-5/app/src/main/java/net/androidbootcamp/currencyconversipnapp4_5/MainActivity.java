package net.androidbootcamp.currencyconversipnapp4_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double amount = 0;
    double totalAmount = 0;
    // double EuroToUs = 1.135; to convert back
    double UsToEuro = 0.880;
    //double CanadianToUs = 0.774; to convert back
    double UsToCanadian = 1.129;
    //double MexPesotoUs = 0.060; to convert back
    double UsToMexPeso = 16.413;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_money);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText txtAmount = (EditText) findViewById(R.id.txtAmount);
        final RadioButton radOne = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton radTwo = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton radThree = (RadioButton) findViewById(R.id.radioButton3);
        final TextView Result = (TextView) findViewById(R.id.txtResult);
        Button convert = (Button) findViewById(R.id.btnCalc);
        convert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amount = Double.parseDouble(txtAmount.getText().toString());
                DecimalFormat currency = new DecimalFormat("$###.##");

                if (radOne.isChecked()) {
                    if (amount >= 1) {
                        totalAmount = amount * UsToEuro;
                        Result.setText(currency.format(totalAmount) + "Conversion from U.S to Euro = ");
                    } else {
                        Toast.makeText(MainActivity.this, "Must be greater than 1.00", Toast.LENGTH_LONG).show();
                    }
                }
                if (radTwo.isChecked()) {
                    if (amount >= 1) {
                        totalAmount = amount * UsToCanadian;
                        Result.setText(currency.format("Conversion from U.s to Canadian = " + totalAmount));
                    } else {
                        Toast.makeText(MainActivity.this, "Must be greater than 1.00", Toast.LENGTH_LONG).show();
                    }
                }
                if (radThree.isChecked()){
                    if (amount >= 1) {
                        totalAmount = amount * UsToMexPeso;
                        Result.setText(currency.format("Conversion from U.S to Mexican Peso = " + totalAmount));
                    } else {
                        Toast.makeText(MainActivity.this, "Must be greater than 1.00", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}