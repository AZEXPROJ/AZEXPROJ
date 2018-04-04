package com.example.osama.azexproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LouisBraille extends AppCompatActivity {
    TextView tv;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_louis_braille);
        tv=(TextView) findViewById(R.id.tv);

        s="لويس برايل أو لويس براي (بالفرنسية: Louis Braille) \u200F (4 يناير 1809 – 6 يناير 1852) مطور كتابة بريل، وهو نظام كتابة وقراءة عالمي يستخدمه الأشخاص المكفوفون، أو الذين يعانون من ضعف حاد في البصر. لويس برايل نفسه اصيب بالعمى بسبب حادث، لكنه اظهر تفوق على إصابته واحدث ثورة بابتكاره نظام كتابة بريل إذ تُقرأ بتمرير الأصابع على حروف مكتوبة بنتوءات بارزة (من واحد إلى ست نتوءات)، وقد تم تبني هذا النظام تقريبا في كل اللغات المعروفة.";

        tv.setText(s);

    }
}
