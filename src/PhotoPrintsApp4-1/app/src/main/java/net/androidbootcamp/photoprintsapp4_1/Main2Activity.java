package net.androidbootcamp.photoprintsapp4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {
    double amount = 0;
    double totalAmount;
    double price1 = .19;
    double price2 = .49;
    double price3 = .79;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_photo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText txtAmount = (EditText) findViewById(R.id.txtAmount);
        final RadioButton radOne = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton radTwo = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton radThree = (RadioButton) findViewById(R.id.radioButton3);
        final TextView Result = (TextView) findViewById(R.id.txtResult);
        Button convert = (Button) findViewById(R.id.button);

        convert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                amount = Double.parseDouble(txtAmount.getText().toString());
                DecimalFormat currency = new DecimalFormat("$###.##");

                if (radOne.isChecked()) {
                    if (amount <= 50) {
                        totalAmount = amount * price1;
                        Result.setText(currency.format(amount) + "");
                    } else {
                        Toast.makeText(Main2Activity.this, "Must be less than 50", Toast.LENGTH_LONG).show();
                    }
                }
                if (radTwo.isChecked()) {
                    if (amount <= 50) {
                        totalAmount = amount * price2;
                        Result.setText(currency.format(amount) + "");
                    } else {
                        Toast.makeText(Main2Activity.this, "Must be less than 50", Toast.LENGTH_LONG).show();
                    }
                }
                if (radThree.isChecked()){
                     if (amount <= 50) {
                         totalAmount = amount * price3;
                         Result.setText(currency.format(amount) + "");
                        } else {
                         Toast.makeText(Main2Activity.this, "Must be less than 50", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        });
    }
}