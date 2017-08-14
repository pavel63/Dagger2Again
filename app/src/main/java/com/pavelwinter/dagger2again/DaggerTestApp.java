package com.pavelwinter.dagger2again;

import android.app.Application;
import android.content.Context;

/**
 * Created by newuser on 03.06.2017.
 */

public class DaggerTestApp extends Application {

    IDaggerTestComponent component;


    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerIDaggerTestComponent
                .builder()
                .daggerTestImageModelModule(new DaggerTestImageModelModule())
                .daggerTestSpeakerModule(new DaggerTestSpeakerModule())
                .build();
    }


    public static IDaggerTestComponent component(Context context){
        return ((DaggerTestApp) context.getApplicationContext()).component;
    }

}
