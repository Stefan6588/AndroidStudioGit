package com.example.stefan.wildgingerdinnerdeliverytabletapp8_5;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends ActionBarActivity {
    private TextView reservation;

    Calendar c = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, monthOfYear);
            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            reservation.setText("Your reservation is set for " + fmtDate.format(c.getTime()));
        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reservation = (TextView) findViewById(R.id.txtReservation);
        Button button = (Button) findViewById(R.id.btnDate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        TimePicker tp = (TimePicker)
                findViewById(R.id.timePicker);
        tp.setIs24HourView(true);
        tp.setCurrentMinute(10);
        tp.setCurrentHour(13);
        tp.setOnTimeChangedListener(OnTimeChanged);
    }

    public  void doButtonClick(View e) {
        TextView tv =
                (TextView)findViewById(R.id.txtReservation);
        TimePicker tp =
                (TimePicker) findViewById(R.id.timePicker);
        tv.setText(tp.getCurrentHour().toString()
                + ":" + tp.getCurrentMinute().toString());
    }

    TimePicker.OnTimeChangedListener OnTimeChanged =
            new TimePicker.OnTimeChangedListener() {
                @Override
                public void onTimeChanged(
                        TimePicker view,
                        int hourOfDay,
                        int minute) {
                    TextView tv =
                            (TextView) findViewById(R.id.txtReservation);
                    tv.setText(Integer.toString(hourOfDay) +
                            ":" + Integer.toString(minute));
                }
            };

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