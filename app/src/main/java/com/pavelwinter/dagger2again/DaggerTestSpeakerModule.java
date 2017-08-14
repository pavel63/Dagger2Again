package com.pavelwinter.dagger2again;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by newuser on 03.06.2017.
 */

@Module
public class DaggerTestSpeakerModule {

    @Provides
    @Singleton
    public Speaker provideSpeaker(){
        Speaker speaker = new Speaker();
        return speaker;
    }
}
