package com.nejat.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<DataModel> dataModels;
    public static CustomeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        listView = (ListView) findViewById(R.id.list);


        dataModels = new ArrayList<>();
        dataModels.add(new DataModel("Apple Pie", "Android 1.0"));
        dataModels.add(new DataModel("Banana Bread", "Android 1.1"));
        dataModels.add(new DataModel("Cupcake", "Android 1.5"));
        dataModels.add(new DataModel("Donut","Android 1.6"));
        dataModels.add(new DataModel("Eclair", "Android 2.0"));
        dataModels.add(new DataModel("Froyo", "Android 2.2"));
        dataModels.add(new DataModel("Gingerbread", "Android 2.3"));
        dataModels.add(new DataModel("Honeycomb","Android 3.0"));
        dataModels.add(new DataModel("Ice Cream Sandwich", "Android 4.0"));

        adapter = new CustomeAdapter(getApplicationContext(),dataModels);
        listView.setAdapter(adapter);

    }
}
