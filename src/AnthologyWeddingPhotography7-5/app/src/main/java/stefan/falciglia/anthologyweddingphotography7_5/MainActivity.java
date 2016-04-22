package stefan.falciglia.anthologyweddingphotography7_5;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Integer[] Wedding= {R.drawable.wedding1,R.drawable.wedding2, R.drawable.wedding3,
            R.drawable.wedding4, R.drawable.wedding5, R.drawable.wedding6, R.drawable.wedding7,
            R.drawable.wedding8, R.drawable.wedding9, R.drawable.wedding10};
    ImageView pic;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imageLarge);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Selected Wonder :" + (position + 1), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Wedding[position]);
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter(Context c){context = c;}

        public int getCount(){return Wedding.length;}

        public Object getItem(int position){
            return null;
        }
        public long getItemId(int position){
            return 0;
        }
        public View getView (int position, View convertView,ViewGroup parent){
            pic = new ImageView(context);
            pic.setImageResource(Wedding[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330, 300));
            return pic;
        }
    }
}
