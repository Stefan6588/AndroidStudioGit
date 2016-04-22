package stefan.falciglia.splitbillapp3_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double total;
    double tip = .18;
    double finalTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spin = (Spinner) findViewById((R.id.spinner));
        final EditText editText = (EditText)findViewById(R.id.editText);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

    public void onClick(View view) {
                total= Integer.parseInt(editText.getText().toString());
                finalTotal = total * tip;
                DecimalFormat currency = new DecimalFormat("$#,###.##");
                result.setText("18% Tip =  " +  finalTotal + currency.format(total));
            }
    });
}

}