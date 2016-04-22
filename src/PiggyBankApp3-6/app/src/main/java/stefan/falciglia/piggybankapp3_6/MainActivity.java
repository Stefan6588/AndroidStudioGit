package stefan.falciglia.piggybankapp3_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    double totalCost;
    //string groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spin = (Spinner) findViewById((R.id.spinner));
        final String groupChoice = String.valueOf(spin.getSelectedItem());
        //final EditText txtTickets = (EditText)findViewById(R.id.______);

        Button btnCost = (Button)findViewById(R.id.button);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View v) {
                //amount = Integer.parseInt(txtTickets.getText().toString());
                //totalCost = costPerTicket * numberOfTickets;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                //groupChoice = group.getSelectedItem().toString();
                System.out.println ("Your amount contain the following");
                System.out.println ("quarters:   " + quarters);
                System.out.println ("dimes:    " + dimes);
                System.out.println ("nickels:    " + nickels);
                System.out.println ("pennies:    " + pennies);


                result.setText("Total Cost for " + groupChoice + 			currency.format(totalCost));
            }
        });}


    public double getChange(int payment, double amountOwed, double change)
    {
        change = payment - amountOwed;
        change = change * 100;
        return change;
    }

    public int Dollars(int dollars, double change)
    {
        double remainder;
        if (change >= 100)
        {
            dollars = (int) (change / 100);
            remainder = dollars * 100;
            change = change - remainder;

        }
        return dollars;
    }

    public int Quarters(int quarters, double change)
    {
        double remainder;
        if (change >= 25)
        {
            quarters = (int) (change / 25);
            remainder = quarters * 25;
            change = change - remainder;

        }
        return quarters;
    }

    public int Dimes(int dimes, double change)
    {
        double remainder;
        if (change >= 10)
        {
            dimes = (int) (change / 10);
            remainder = dimes * 10;
            change = change - remainder;

        }
        return dimes;
    }

    public int Nickels(int nickels, double change)
    {
        double remainder;
        if (change >= 5)
        {
            nickels = (int) (change / 5);
            remainder = nickels * 5;
            change = change - remainder;

        }
        return nickels;
    }

    public int Pennies(int pennies, double change)
    {
        double remainder;
        if (change >= 1)
        {
            pennies = (int) (change / 1);
            remainder = pennies * 1;
            change = change - remainder;

        }
        return pennies;
    }
}
