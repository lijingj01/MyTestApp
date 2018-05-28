package com.test.lijingjing.mytestapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Main4Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        GridView normalGridView = (GridView)findViewById(R.id.MyProject);

        String[] normalArray = new String[]{"coding", "ending", "Java", "Github", "coder", "Android"};
        ArrayAdapter<String> normalAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, normalArray);
        normalGridView.setAdapter(normalAdapter);
    }
}
