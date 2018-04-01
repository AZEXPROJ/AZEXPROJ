package com.example.osama.azexproj;

import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeechService;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by mahmoud reda on 01/04/2018.
 */

public class TexttoSpeech extends Fragment {
    private static final String Tag = "Table2Fragment";

    View view;
    int res;
    String text;
    EditText editText;
    TextToSpeech textToSpeech;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.speechtotext,container,false);
        editText=(EditText)view.findViewById(R.id.etext);
        //to speech
        textToSpeech=new TextToSpeech( getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i==TextToSpeech.SUCCESS){
                    res= textToSpeech.setLanguage(Locale.ENGLISH);
                }else {
                    Toast.makeText(getActivity().getApplicationContext(),"Feature not Supported in your Device", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view ;
    }

    public void listen(View view) {
        if (res==TextToSpeech.LANG_MISSING_DATA||res==TextToSpeech.LANG_NOT_SUPPORTED){
            Toast.makeText(getActivity().getApplicationContext(),"Feature not Supported in your Device", Toast.LENGTH_SHORT).show();
        }else {
            text=editText.getText().toString();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
            } else {
                textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (textToSpeech!=null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }


}