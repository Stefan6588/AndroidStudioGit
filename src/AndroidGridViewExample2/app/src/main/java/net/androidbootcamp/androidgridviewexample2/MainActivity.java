package net.androidbootcamp.androidgridviewexample2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

        GridView gridView;
        static final String[] MOBILE_OS = new String[] { "Greece", "Germany","Italy", "Britain" };

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            gridView = (GridView) findViewById(R.id.gridView);
            gridView.setAdapter(new MyAdapter(this, MOBILE_OS));
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView parent, View v,
                                        int position, long id) {
                    Toast.makeText(
                            getApplicationContext(),
                    ((TextView) v.findViewById(R.id.label)).getText(), Toast.LENGTH_SHORT).show();
                }
            });
    }
}
