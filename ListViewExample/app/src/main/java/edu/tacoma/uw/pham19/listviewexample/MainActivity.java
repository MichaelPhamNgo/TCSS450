package edu.tacoma.uw.pham19.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = {"HowKteam", "Free Education", "Share to be better"};
        listview = (ListView)findViewById(R.id.list_view);

        KteamAdapter adapter = new KteamAdapter(this, items);
        listview.setAdapter(adapter);
    }
}