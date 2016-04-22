package com.example.stefan.finaltouchautodetailingtabletapp8_4;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Calendar;

    public class MainActivity extends ActionBarActivity {
        private TextView reservation;

        @Override
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
        }
        public void onCheckboxClicked(View view) {
            boolean checked = ((CheckBox) view).isChecked();

            // Check which checkbox was clicked
            switch(view.getId()) {
                case R.id.checkbox:
                    if (checked)
                    // calculate blahblah
                    break;
                case R.id.checkBox2:
                    if (checked)
                    // calculate blahblah
                    break;
                case R.id.checkBox3:
                    if (checked)
                        // calculate blahblah
                        break;
                case R.id.checkBox4:
                    if (checked)
                        // calculate blahblah
                        break;
            }
        }

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
}
