package net.androidbootcamp.powertoolrentalapp4_3;

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
    double totalAmount = 0;
    double washer = 55.99;
    double tiller = 68.99;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_drill);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText txtAmount = (EditText) findViewById(R.id.txtAmount);
        final RadioButton radOne = (RadioButton) findViewById(R.id.radOne);
        final RadioButton radTwo = (RadioButton) findViewById(R.id.radTwo);
        final TextView Result = (TextView) findViewById(R.id.txtResult);
        Button convert = (Button) findViewById(R.id.btnCalc);

        convert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amount = Double.parseDouble(txtAmount.getText().toString());
                DecimalFormat currency = new DecimalFormat("$###.##");

                if (radOne.isChecked()) {
                    if (amount > 7) {
                        totalAmount = amount * washer;
                        //finish display result (priority low)
                        Result.setText(currency.format(amount) + "");
                    } else {
                        Toast.makeText(MainActivity.this, "Must be less than 7 days", Toast.LENGTH_LONG).show();

                    }
                }
                if (radTwo.isChecked()) {
                    if (amount > 7) {
                        totalAmount = amount * tiller;
                        //finish display result (priority low)
                        Result.setText(currency.format(amount) + "");
                    } else {
                        Toast.makeText(MainActivity.this, "Must be less than 7 days ", Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
    }
}