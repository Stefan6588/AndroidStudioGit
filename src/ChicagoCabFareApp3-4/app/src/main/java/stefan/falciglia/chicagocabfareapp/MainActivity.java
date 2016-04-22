package stefan.falciglia.chicagocabfareapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

    public class Main2Activity extends AppCompatActivity {
        double  costPerMile = 3.25;
        int numberOfMiles = 0;
        double totalCost;
        string groupChoice;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            final Spinner spin = (Spinner) findViewById((R.id.spinner));
            final String groupChoice = String.valueOf(spin.getSelectedItem());
            final EditText distance = (EditText)findViewById(R.id.distance);

            Button btnCost = (Button)findViewById(R.id.button);
            btnCost.setOnClickListener(new View.OnClickListener() {
                final TextView result = ((TextView) findViewById(R.id.txtresults));

                @Override
                public void onClick(View view) {
                    costPerMile= Integer.parseInt(distance.getText().toString());
                    totalCost = numberOfMiles * costPerMile;
                    DecimalFormat currency = new DecimalFormat("$###.##");
                    groupChoice = group.getSelectedItem().toString();
                    result.setText("Total Cost for " + groupChoice + currency.format(totalCost));
                }

            });
        }

    }

