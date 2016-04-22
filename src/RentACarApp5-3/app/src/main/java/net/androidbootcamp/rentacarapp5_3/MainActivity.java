package net.androidbootcamp.rentacarapp5_3;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ListActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().setDisplayShowHomeEnabled(true);
        getActionBar().setLogo(R.drawable.ic_launcher_uber);
        getActionBar().setDisplayUseLogoEnabled(true);

        Button next = (Button) findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    ///next page?

    }

});
    }}