package stefan.falciglia.paintcalculatorapp3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;

    double num1,num2,sum,gallons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstNumber = (EditText)findViewById(R.id.editText);
        secondNumber = (EditText)findViewById(R.id.editText2);
        addResult = (TextView)findViewById(R.id.Result);
        btnAdd = (Button)findViewById(R.id.button);
    }
    public void onClick(View v) {
        num1 = Double.parseDouble(firstNumber.getText().toString());
        num2 = Double.parseDouble(secondNumber.getText().toString());
        sum = num1 * num2; //multiply for sq ft
        gallons = sum/250;
        addResult.setText(Double.toString(sum));
        addResult.setText(Double.toString(gallons));
    }
}
