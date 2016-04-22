package stefan.falciglia.gridviewexample1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
        GridView grid;
        static final String[] letters = new String[] {
                "A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"};
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            grid = (GridView) findViewById(R.id.gridView);
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, letters);
            grid.setAdapter(adapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView parent, View v, int position, long id) {
                    Toast.makeText(getApplicationContext(),
                    ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
