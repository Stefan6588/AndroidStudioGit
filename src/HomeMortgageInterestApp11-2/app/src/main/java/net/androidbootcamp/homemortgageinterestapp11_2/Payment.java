package net.androidbootcamp.homemortgageinterestapp11_2;

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


public class Payment extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView monthlyPayment = (TextView) findViewById(R.id.txtMonthlyPayment);
        ImageView image = (ImageView) findViewById(R.id.imgYears);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        int intYears = sharedPref.getInt("key1", 0);
        int intPrincipal = sharedPref.getInt("key2", 0);
        float decMonthlyPayment = sharedPref.getInt("key3", 0);
        float decInterest;

        //decMonthlyPayment = (intLoan * (1 + (decInterest * intYears))) / (12 * intYears);
        DecimalFormat currency = new DecimalFormat("$###,###.##");
        monthlyPayment.setText("Monthly Payment " + currency.format(decMonthlyPayment));

        if (intYears == 10) {
            decInterest = ((decMonthlyPayment * 120) - intPrincipal);
            monthlyPayment.setText("Monthly Payment 10 Years" + currency.format(decInterest));
            image.setImageResource(R.drawable.ten);
        } else if (intYears == 20) {
            decInterest = ((decMonthlyPayment * 240) - intPrincipal);
            monthlyPayment.setText("Monthly Payment 20 Years" + currency.format(decInterest));
            image.setImageResource(R.drawable.twenty);
        } else if (intYears == 30) {
            decInterest = ((decMonthlyPayment * 360) - intPrincipal);
            monthlyPayment.setText("Monthly Payment 30 Years" + currency.format(decInterest));
            image.setImageResource(R.drawable.thirty);
        } else {
            monthlyPayment.setText("Enter 20,30,30 years");
        }
    }
}