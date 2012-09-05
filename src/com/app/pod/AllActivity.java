package com.app.pod;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AllActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.all_layout, menu);
        return true;
    }
}
