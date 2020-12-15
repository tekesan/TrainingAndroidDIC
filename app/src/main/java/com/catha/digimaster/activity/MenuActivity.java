package com.catha.digimaster.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.catha.digimaster.R;
import com.catha.digimaster.fragment.HomeFragment;
import com.catha.digimaster.fragment.ListMenuFragment;
import com.catha.digimaster.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bottomNav = findViewById(R.id.btmNav);

        //initialize home fragment
        HomeFragment homeFragment = new HomeFragment();
        loadFragment(homeFragment);

        bottomNav.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.flMenu, fragment).commit();

            return true;
        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch(item.getItemId()){

            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.list:
                fragment = new ListMenuFragment();
                break;
            case R.id.profile:
                fragment = new ProfileFragment();
                break;
        }

        return loadFragment(fragment);
    }
}