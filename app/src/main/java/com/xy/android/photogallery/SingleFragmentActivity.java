package com.xy.android.photogallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xy on 2017/11/7.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {
    protected abstract Fragment creatFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null){
            fragment = creatFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }
}
