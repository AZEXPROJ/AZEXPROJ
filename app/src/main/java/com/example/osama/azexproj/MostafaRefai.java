package com.example.osama.azexproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MostafaRefai extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostafa_refai);
      tv= (TextView) findViewById(R.id.tv);

      String s = "(الاديب مصطفى الرافعي) \n" +
              "اديب مصري مشهور اصيب بالصمم في الثلاثين من عمره \n" +
              "ولم تقف اعاقتها حاجزا في وجهه فقد حقق شهرة ادبيه واسعه \n" +
              "له كتاب المعركه تحت راية القراْن وكتاب المساكين و كتاب السحاب الاحمر \n" +
              "والكثير من المقالات الادبيه \n" +
              "ويعد الرافعي من الادباء الاسلاميين الذين خدموا الاسلام باْدبهم وشعرهم \n" +
              "توفي الرافعي سنة 1937 م";

        tv.setText(s);


    }
}
