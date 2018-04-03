package com.example.osama.azexproj;
import android.content.Context;
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
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
        video = (ImageView) findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( context ,videos.class);
                startActivity(intent);
            }
        });
        stories = (ImageView) findViewById(R.id.stories);
        stories.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( context ,stories.class);
                startActivity(intent);
            }
        });
        qoutes = (ImageView) findViewById(R.id.qoutes);
        qoutes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( context ,quotes.class);
                startActivity(intent);
            }
        });
    }
}

