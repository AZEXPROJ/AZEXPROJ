package com.example.osama.azexproj;


import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
public class Treatment extends AppCompatActivity {
    private static final String Tag = "Treatment";
    private SectionPageAdapter sectionPageAdapter;
    private  ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);
        Log.d(Tag,"onCreate: Starting.");

        sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        viewPager = (ViewPager )findViewById(R.id.container);
        setupViewerPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewerPager (ViewPager viewPager){
        SectionPageAdapter adapter=new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new SpeechToText(),"تحـدث");
        adapter.addFragment(new TexttoSpeech(),"اســمع");
        viewPager.setAdapter(adapter);

    }
}
