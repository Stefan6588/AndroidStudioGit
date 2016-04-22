package net.androidbootcamp.quickhealthysnackideasapp7_1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
        Integer[] Snacks= {R.drawable.snack1,R.drawable.snack2, R.drawable.snack3,
                R.drawable.snack4, R.drawable.snack5,};
        ImageView pic;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            GridView grid = (GridView) findViewById(R.id.gridView);
            final ImageView pic = (ImageView) findViewById(R.id.imgLarge);
            grid.setAdapter(new ImageAdapter(this));
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getBaseContext(), "Selected Snacks" + (position + 1), Toast.LENGTH_SHORT).show();
                    pic.setImageResource(Snacks[position]);
                }
            });
        }

            public class ImageAdapter extends BaseAdapter {
                    private Context context;
                    public ImageAdapter(Context c){context = c;}

                    public int getCount(){return Snacks.length;}

                public Object getItem(int position){
                    return null;
                }
                public long getItemId(int position){
                    return 0;
                }
                //was working but now is [context is not resolving]
                public View getView (int position, View convertView,ViewGroup parent){
                    pic = new ImageView(context);
                    pic.setImageResource(Snacks[position]);
                    pic.setScaleType(ImageView.ScaleType.FIT_XY);
                    pic.setLayoutParams(new GridView.LayoutParams(330, 300));
                    return pic;
                }
            }
        }

