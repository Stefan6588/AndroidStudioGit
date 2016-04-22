package stefan.falciglia.healthyrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//activity class
public class Recipe extends AppCompatActivity {

    @Override       // a method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        Button button = (Button) findViewById(R.id.btnRecipe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override   //event handler
            public void onClick(View v) {
                startActivity(new Intent(Recipe.this, Recipe.class));

            }
        });
    }

}
