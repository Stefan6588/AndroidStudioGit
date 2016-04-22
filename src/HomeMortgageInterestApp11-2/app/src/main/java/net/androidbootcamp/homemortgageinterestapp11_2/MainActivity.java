package net.androidbootcamp.homemortgageinterestapp11_2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.security.Principal;

public class MainActivity extends ActionBarActivity {
    int intYears;
    int intPrincipal;//principal
    float decMonthlyPayment;//was interest rate

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText years = (EditText) findViewById(R.id.txtYears);
        final EditText Principal = (EditText) findViewById(R.id.txtLoan);
        final EditText MonthlyPayment = (EditText) findViewById(R.id.txtInterest);
        Button button = (Button) findViewById(R.id.btnPayment);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intYears = Integer.parseInt(years.getText().toString());
                intPrincipal = Integer.parseInt(Principal.getText().toString());
                decMonthlyPayment = Float.parseFloat(MonthlyPayment.getText().toString());
                SharedPreferences.Editor editor= sharedPref.edit();
                editor.putInt("key1", intYears);
                editor.putInt("key2", intPrincipal);
                editor.putFloat("key3", decMonthlyPayment);
                editor.commit();
                startActivity(new Intent(MainActivity.this, Payment.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}