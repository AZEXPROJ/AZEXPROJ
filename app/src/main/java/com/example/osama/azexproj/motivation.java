package com.example.osama.azexproj;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class motivation extends AppCompatActivity {
ImageView video ;
ImageView stories;
ImageView qoutes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);

        video = (ImageView) findViewById(R.id.video);




        video.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( motivation.this ,videos.class);
                startActivity(intent);

            }
        });

        stories = (ImageView) findViewById(R.id.stories);
        video.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( motivation.this ,stories.class);
                startActivity(intent);

            }
        });
        qoutes = (ImageView) findViewById(R.id.qoutes);
        video.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( motivation.this ,quotes.class);
                startActivity(intent);

            }
        });
    }
}

