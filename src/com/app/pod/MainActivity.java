package com.app.pod;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);
        
        Tab tab = actionBar.newTab().setText("Favoritos").setTabListener(new TabManagerListener<FavoriteTabContentFragment>(this, "favoritos", FavoriteTabContentFragment.class));
        actionBar.addTab(tab);
        
        tab = actionBar.newTab().setText("Favoritos").setTabListener(new TabManagerListener<AllTabContentFragment>(this, "todos", AllTabContentFragment.class));
        actionBar.addTab(tab);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
