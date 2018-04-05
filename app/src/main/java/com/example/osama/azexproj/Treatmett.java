package com.example.osama.azexproj;

import android.content.Intent;
        import android.os.Build;
        import android.speech.RecognizerIntent;
        import android.speech.tts.TextToSpeech;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.Locale;

public class Treatmett extends AppCompatActivity {
    TextToSpeech textToSpeech;
    int res;
    EditText editText;
    String text;
    TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatmett);
        txvResult = (TextView) findViewById(R.id.txvResult);
        editText=(EditText)findViewById(R.id.etext);
        //to speech
        textToSpeech=new TextToSpeech(Treatmett.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i==TextToSpeech.SUCCESS){
                    res= textToSpeech.setLanguage(Locale.ENGLISH);
                }else {
                    Toast.makeText(getApplicationContext(),"Feature not Supported in your Device", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void listen(View view) {
        if (res==TextToSpeech.LANG_MISSING_DATA||res==TextToSpeech.LANG_NOT_SUPPORTED){
            Toast.makeText(getApplicationContext(),"Feature not Supported in your Device", Toast.LENGTH_SHORT).show();
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
    protected void onDestroy() {
        super.onDestroy();
        if (textToSpeech!=null){
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }

    //to text
    public void getSpeechInput(View view) {

        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 10);
        } else {
            Toast.makeText(this, "Your Device Don't Support Speech Input", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 10:
                if (resultCode == RESULT_OK && data != null) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txvResult.setText(result.get(0));
                }
                break;
        }
    }
}

