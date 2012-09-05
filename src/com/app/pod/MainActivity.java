package com.app.pod;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = getTabHost();
        
        // tab para favoritos
        TabSpec favoritosSpec = tabHost.newTabSpec("Favoritos");
        favoritosSpec.setIndicator("Favoritos");
        Intent favoritosIntent = new Intent(this, FavActivity.class);
        favoritosSpec.setContent(favoritosIntent);
        
        // tab para favoritos
        TabSpec mainSpec = tabHost.newTabSpec("Todos");
        mainSpec.setIndicator("Todos");
        Intent mainIntent = new Intent(this, AllActivity.class);
        mainSpec.setContent(mainIntent);
        
        tabHost.addTab(mainSpec);
        tabHost.addTab(favoritosSpec);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
