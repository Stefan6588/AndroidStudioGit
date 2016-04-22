package net.androidbootcamp.newsevenwondersoftheworldapp7_2;

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
        Integer[] Wonders= {R.drawable.wonder1,R.drawable.wonder2, R.drawable.wonder3,
                R.drawable.wonder4, R.drawable.wonder5, R.drawable.wonder6, R.drawable.wonder7};
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
                    pic.setImageResource(Wonders[position]);
                }
            });
        }

        public class ImageAdapter extends BaseAdapter {
            private Context context;
            public ImageAdapter(Context c){context = c;}

            public int getCount(){return Wonders.length;}

            public Object getItem(int position){
                return null;
            }
            public long getItemId(int position){
                return 0;
            }
            public View getView (int position, View convertView,ViewGroup parent){
                pic = new ImageView(context);
                pic.setImageResource(Wonders[position]);
                pic.setScaleType(ImageView.ScaleType.FIT_XY);
                pic.setLayoutParams(new GridView.LayoutParams(330, 300));
                return pic;
            }
        }
    }

