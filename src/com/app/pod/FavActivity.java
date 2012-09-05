package com.app.pod;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FavActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_fav, menu);
        return true;
    }
}
