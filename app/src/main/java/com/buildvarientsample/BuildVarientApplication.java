package com.buildvarientsample;

import android.app.Application;
import android.content.Context;

/**
 * Created by kiwitech on 23/4/16.
 */
public class BuildVarientApplication extends Application {

    public static BuildVarientApplication buildVarientApplication;

    public Context getAppContext(){
        return buildVarientApplication.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        buildVarientApplication = this;
    }
}
