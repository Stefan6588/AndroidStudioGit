package stefan.falciglia.catalinaislandapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {
    double  costPerTicket= 34.00;
    int numberOfTickets;
    double totalCost;
    string groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Spinner spin = (Spinner) findViewById((R.id.txtGroup));
        final String groupChoice = String.valueOf(spin.getSelectedItem());
        final EditText txtTickets = (EditText)findViewById(R.id.txtTickets);

        Button btnCost = (Button)findViewById(R.id.btnCost);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtResult));
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
