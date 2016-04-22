package com.example.stefan.oasisspatabletapp9_1.dummy;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.webkit.WebView;

        import com.example.stefan.oasisspatabletapp9_1.R;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class DummyContent {

    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "Photos"));
        addItem(new DummyItem("2", "Tour"));
        addItem(new DummyItem("3", "Website", "http://bikebarge.com"));
    }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    public static class DummyItem {
        public String id;
        public String content;
        public String item_name;
        public String item_url;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        public DummyItem(String id, String item_name, String item_url) {
            this.id = id;
            this.item_name = item_name;
            this.item_url = item_url;
            content = item_name;
        }

        @Override
        public String toString() {
            return content;
        }
    }
    protected View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        if (mItem.id.equals("1")){
            rootView = inflater.inflate(R.layout.photos, container, false);
        }
        if (mItem.id.equals("2")) {
            rootView = inflater.inflate(R.layout.tour, container, false);
        }
        if (mItem.id.equals("3")){
            ((WebView)rootView.findViewById(R.id.item_detail)).loadUrl(mItem.item_url);
        }
        return rootView;

    }
}
