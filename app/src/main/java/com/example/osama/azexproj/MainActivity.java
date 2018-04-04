package com.example.osama.azexproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button treet;
    Button moti;
    Button map;
    Button aboutUs;
    Button active;
    Button games;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        treet=(Button)findViewById(R.id.treet_btn);
        moti=(Button)findViewById(R.id.moti_btn);
        map=(Button)findViewById(R.id.map_btn);
        aboutUs=(Button)findViewById(R.id.aboutUs_btn);
        active=(Button)findViewById(R.id.active_btn);
        games=(Button)findViewById(R.id.games_btn);

        //onClick treatment
        treet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Treatment.class);
                startActivity(intent);
            }
        });

        //onClick motivation
        moti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,motivation.class);
                startActivity(intent);
            }
        });

        //onClick map
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        //onClick about us
      /*  aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AboutUs.class);
                startActivity(intent);
            }
        });*/

        //onClick active
       /* active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Active.class);
                startActivity(intent);
            }
        });*/

        //onClick game
        /*games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Games.class);
                startActivity(intent);
            }
        });*/


    }

}
