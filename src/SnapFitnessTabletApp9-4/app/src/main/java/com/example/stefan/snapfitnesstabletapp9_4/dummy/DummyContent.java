package com.example.stefan.snapfitnesstabletapp9_4.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Photos"));
        addItem(new DummyItem("2", "Tour"));
        addItem(new DummyItem("3", "Web Site", "http://bikebarge.com"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;
        public String item_name;
        public String item_url;


        public DummyItem(String id, String item_name, String item_url) {
            this.id = id;
            this.item_name = item_name;
            this.item_url = item_url;
            content = item_name;

        }

        public DummyItem(String s, String photos) {
        }


        @Override
        public String toString() {
            return content;
        }
    }
}
