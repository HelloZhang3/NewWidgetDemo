package com.rockmobile.zyd;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AutoHideTitleActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private SwipeRefreshLayout mSwipeLayout;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_auto_hide_title);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        mSwipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_layout);
        listView = (ListView) findViewById(R.id.list);

//        toolbar.

        String[] data = new String[15];
        for (int i = 0; i < data.length; i++) {
            data[i] = "position" + i;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

    }
}
