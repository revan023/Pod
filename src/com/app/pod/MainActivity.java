package com.app.pod;

import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        /*
        TabHost tabHost = getTabHost();
        
        // tab para favoritos
        TabSpec favoritosSpec = tabHost.newTabSpec("Favoritos");
        favoritosSpec.setIndicator("Favoritos");
        Intent favoritosIntent = new Intent(this, FavoriteTabContentFragment.class);
        favoritosSpec.setContent(favoritosIntent);
        
        // tab para favoritos
        TabSpec mainSpec = tabHost.newTabSpec("Todos");
        mainSpec.setIndicator("Todos");
        Intent mainIntent = new Intent(this, AllActivity.class);
        mainSpec.setContent(mainIntent);
        
        tabHost.addTab(mainSpec);
        tabHost.addTab(favoritosSpec);
        */
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
