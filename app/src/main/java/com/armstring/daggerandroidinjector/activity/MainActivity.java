package com.armstring.daggerandroidinjector.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.armstring.daggerandroidinjector.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    //@Inject member1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
