package com.example.osama.azexproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StephenHawking extends AppCompatActivity {
      String s;
      TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stephen_hawking);
        tv=(TextView)findViewById(R.id.tv);
       s="ستيفن هوكينج عالم فيزياء تحدى الإعاقة وسابق الزمن\n" +
               "إعمالا بمقولة \"انظروا إلى النجوم وليس أقدامكم\" استطاع ستيفن هوكينج قاهر الصعاب ومتحدى الزمن أن ينتصر على إعاقته ويحقق مزيدًا من النجاحات، فأصيب ستيفن بمرض عصبى وهو فى الحادية والعشرين من عمره وهو مرض التصلب الجانبى als، المرض المميت الذى لا علاج له، لكنه كان مفعم بمعرفة كيفية عمل الأشياء حيث أطلقوا عليه فى المدرسة لقب أينشتاين، وتوقع الأطباء أنه لا يعيش أكثر من سنتين وبالتحدى والإقبال على النجاح استطاع قهر العجز وإبهار الأطباء بمجاهدته حتى تجاوز عمره الـ72 عامًا، ما أتاح له فرصة العطاء فى مجال العلوم وبالتحديد علوم الفيزياء النظرية، وبالرغم من أن هذا المرض جعله قعيدًا إلا أن عقله لم يقف برهة، حيث حصل على الدكتوراه فى علم الكون من جامعة كامبرج، وحصل على درجة الشرف الأولى فى الفيزياء واستطاع أن يتفوق على أقرانه من علماء الفيزياء وبطريقة لا تصدق كان يجرى كل الحسابات فى ذهنه وشارك ابنته الروائية فى كتابة كتب الأطفال لتقديم شرح مبسط عن الكون بطريقة روائية 2007عام.";

      tv.setText(s);
    }
}
