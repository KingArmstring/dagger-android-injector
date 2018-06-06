package com.armstring.daggerandroidinjector.application;

import android.content.Context;

import com.armstring.daggerandroidinjector.activity.ActivitySubComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {ActivitySubComponent.class})
public class ApplicationModule {

    //fix to the problem that happened in the final tutorial

//    Context context;
//
//    public ApplicationModule(Context context) {
//        this.context  = context;
//    }

//    @Provides
//    Context context() {
//        return this.context;
//    }

    //add this instead to be able to provide the Context for the ApplicationScope
    @Provides Context provideContext(MyApplication application) {
        return application.getApplicationContext();
    }
}
