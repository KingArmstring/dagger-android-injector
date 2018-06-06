package com.armstring.daggerandroidinjector.activity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface ActivitySubComponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder abstract class Builder extends AndroidInjector.Builder<MainActivity>{
    }
}
