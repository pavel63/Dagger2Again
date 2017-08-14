package com.pavelwinter.dagger2again;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //after dependencies and modules and componnt-to generate-build-rebuilt project

    Speaker speaker;
    @Inject
    ImageModel model;


    String urlImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        IDaggerTestComponent component = DaggerTestApp.component(this);
        component.inject(this);


        speaker = component.speaker();


        ImageView view = (ImageView) findViewById(R.id.image);
        //model.downloadTask(view);
        urlImage=model.getImageURL();


        TextView text = (TextView) findViewById(R.id.text);


        speaker.setName("Bullock Sandra");
        speaker.setSpeech("Hi!");

        text.setText(speaker.getName() + "\n" + speaker.getSpeech());





        model.loadPhoto(MainActivity.this,view,urlImage);

    }
}
