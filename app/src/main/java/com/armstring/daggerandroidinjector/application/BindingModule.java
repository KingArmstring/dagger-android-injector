package com.armstring.daggerandroidinjector.application;

import android.app.Activity;

import com.armstring.daggerandroidinjector.activity.ActivitySubComponent;
import com.armstring.daggerandroidinjector.activity.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
abstract public class BindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivity(ActivitySubComponent.Builder builder);
}
