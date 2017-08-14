package com.pavelwinter.dagger2again;

import dagger.Module;
import dagger.Provides;

/**
 * Created by newuser on 03.06.2017.
 */

@Module
public class DaggerTestImageModelModule {

    @Provides
    public ImageModel provideImageModel(String url){
        ImageModel model = new ImageModel();
        model.setImageURL(url);
        return model;
    }

    @Provides
    public String provideUrl(){

        //loads photo from an url
        return "http://www.fotosdefamosas.tk/Fotos/Sandra_Bullock/Sandra_Bullock_072.jpg";
    }
}
