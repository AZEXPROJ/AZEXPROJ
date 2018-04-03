package com.example.osama.azexproj;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ListView;
public class videos extends AppCompatActivity {
    Context context;
    public View getView(int arg0, View convertView, ViewGroup arg2) {
        // TODO Auto-generated method stub

        LayoutInflater inflater =  context.getLayoutInflater();
        convertView = inflater.inflate(R.layout.listitem, null);

        WebView wv = (WebView)convertView.findViewById(R.id.webview);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("http://www.google.com");

        convertView.setTag(wv);

        return convertView;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        ListView lv = (ListView)findViewById(R.id.listview);
        ListViewAdapter adapter = new ListViewAdapter(this);

        lv.setAdapter(adapter);



    }
}
