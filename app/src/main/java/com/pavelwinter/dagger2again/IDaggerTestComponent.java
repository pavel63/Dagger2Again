package com.pavelwinter.dagger2again;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by newuser on 03.06.2017.
 */

@Singleton
@Component(
        modules = {
                DaggerTestImageModelModule.class,
                DaggerTestSpeakerModule.class
        }
)
public interface IDaggerTestComponent {
    void inject(MainActivity mainActivity);
    Speaker speaker();
}
