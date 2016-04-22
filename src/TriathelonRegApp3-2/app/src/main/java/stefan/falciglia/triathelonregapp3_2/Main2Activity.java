package stefan.falciglia.triathelonregapp3_2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {
    double  costPerTicket= 725.00;
    int numberOfTickets;
    double totalCost;
    string groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Spinner spin = (Spinner) findViewById((R.id.spinner));
        final String groupChoice = String.valueOf(spin.getSelectedItem());
        final EditText txtTickets = (EditText)findViewById(R.id.editText);

        Button button = (Button)findViewById(R.id.button);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView) findViewById(R.id.txtResults);

            @Override
            public void onClick(View v) {
                numberOfTickets = Integer.parseInt(txtTickets.getText().toString());
                totalCost = costPerTicket * numberOfTickets;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText("Total Cost for " + groupChoice + currency.format(totalCost));

            }
        });
    }

}
