package com.pavelwinter.dagger2again;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static java.lang.System.load;

/**
 * Created by newuser on 03.06.2017.
 */

public class ImageModel {


    private String imageURL;

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }




    public void loadPhoto(Context context,ImageView imageView,String urlImage){

Picasso.with(context).load(urlImage).transform(new Transerr(0)).into(imageView);


    }


}
