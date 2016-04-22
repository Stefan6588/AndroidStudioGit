package net.androidbootcamp.androidgridviewexample2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
        private Context context;

        private final String[] countries;

        public MyAdapter(Context context, String[] countries) {
            this.context = context;
            this.countries = countries;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View gridView;

                if (convertView == null) {
                    gridView = new View(context);

                gridView = inflater.inflate(R.layout.countries, null);

                TextView textView = (TextView) gridView.findViewById(R.id.label);

                textView.setText(countries[position]);

                ImageView flag = (ImageView) gridView .findViewById(R.id.flag);
                String mobile = countries[position];
                if (mobile.equals("Greece")) {
                    flag.setImageResource(R.drawable.greekflag);
                } else if (mobile.equals("Germany")) {
                    flag.setImageResource(R.drawable.germanflag);
                } else if (mobile.equals("Italy")) {
                    flag.setImageResource(R.drawable.italianflag);
                } else {
                    flag.setImageResource(R.drawable.britishflag);
                }
            } else {
                gridView = (View) convertView;
            }

            return gridView;
        }
        public int getCount() {
            return countries.length;
        }
        public Object getItem(int position) {
            return null;
        }
        public long getItemId(int position) {
               return 0;

        }
    }
