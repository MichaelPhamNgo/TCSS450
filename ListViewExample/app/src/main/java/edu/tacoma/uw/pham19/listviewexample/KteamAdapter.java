package edu.tacoma.uw.pham19.listviewexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class KteamAdapter extends BaseAdapter {
    private Activity activity;
    private String[] items;
    public KteamAdapter(Activity activity, String[] items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item_name, null);
        TextView tvName = (TextView)view.findViewById(R.id.tv_name);
        tvName.setText(items[i]);
        return view;
    }
}
