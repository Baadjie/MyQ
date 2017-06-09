package com.example.baadjie.myq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Sports extends AppCompatActivity {
    private RadioGroup group;
    private RadioButton radio;

    private RadioGroup group2;
    private RadioButton radio2;

    private RadioGroup group3;
    private RadioButton radio3;

    private RadioGroup group4;
    private RadioButton radio4;

    private RadioGroup group5,group6,group7,group8;
    private RadioButton radio5,radio6 ,radio7,radio8;


    public static final String ANSWERl="answer";
    public static  final String OUTCOME="outcome";
    private Intent intent;
    public static int answer = 0;
    private String intentanswer;
    private String intentOutcome;
    public  String message="  ";

    private  Questions questions =new Questions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        group = (RadioGroup) findViewById(R.id.radioGroup1);
        group2 = (RadioGroup) findViewById(R.id.radioGroup2);
        group3 = (RadioGroup) findViewById(R.id.radioGroup3);
        group4 = (RadioGroup) findViewById(R.id.radioGroup4);
        group5 = (RadioGroup) findViewById(R.id.radioGroup5);
        group6= (RadioGroup) findViewById(R.id.radioGroup6);
        group7= (RadioGroup) findViewById(R.id.radioGroup7);
        group8= (RadioGroup) findViewById(R.id.radioGroup8);
    }

    public void save(View view) {

        int selectId = group.getCheckedRadioButtonId();
        radio = (RadioButton) findViewById(selectId);


        questions.setQ1a(1);
        questions.setQ1b(0);
        questions.setQ1c(0);
        questions.setQ1d(0);



        int score = 0;

        questions.setQ2a(1);
        questions.setQ2b(0);
        questions.setQ2c(0);
        questions.setQ2d(0);

        int score2 = 0;


        questions.setQ3a(1);
        questions.setQ3b(0);
        questions.setQ3c(0);
        questions.setQ3d(0);

        int score3 = 0;


        questions.setQ4a(1);
        questions.setQ4b(0);
        questions.setQ4c(0);
        questions.setQ4d(0);

        int score4 = 0;

        questions.setQ5a(1);
        questions.setQ5b(0);
        questions.setQ5c(0);
        questions.setQ5d(0);
        int score5 = 0;


        questions.setQ6a(1);
        questions.setQ6b(0);
        questions.setQ6c(0);
        questions.setQ6d(0);

        int score6=0;

        questions.setQ7a(1);
        questions.setQ7b(0);
        questions.setQ7c(0);
        questions.setQ7d(0);
        int score7=0;

        questions.setQ8a(1);
        questions.setQ8b(0);
        questions.setQ8c(0);
        questions.setQ8d(0);


        int score8=0;
        int selectIds = group2.getCheckedRadioButtonId();
        radio2 = (RadioButton) findViewById(selectIds);


        int select = group3.getCheckedRadioButtonId();
        radio3 = (RadioButton) findViewById(select);

        int selectId4 = group4.getCheckedRadioButtonId();
        radio4 = (RadioButton) findViewById(selectId4);


        int selectId5 = group5.getCheckedRadioButtonId();
        radio5 = (RadioButton) findViewById(selectId5);


        int selectId6 = group6.getCheckedRadioButtonId();
        radio6 = (RadioButton) findViewById(selectId6);

        int selectId7 = group7.getCheckedRadioButtonId();
        radio7 = (RadioButton) findViewById(selectId7);

        int selectId8 = group8.getCheckedRadioButtonId();
        radio8 = (RadioButton) findViewById(selectId8);




        String message = "";

        if (radio.getId() == R.id.radRonaldo) {

            score = questions.getQ1a();

        } else if (radio.getId() == R.id.radDinho) {

            score = questions.getQ1b();

        } else if (radio.getId() == R.id.radMessi) {

            score = questions.getQ1c();

        } else if (radio.getId() == R.id.radZidane) {

            score = questions.getQ1d();

        }


        // Toast.makeText(Sports.this, " score = " +score,Toast.LENGTH_LONG).show();

        if (radio2.getId() == R.id.radEl) {

            score2 = questions.getQ2c();

        } else if (radio2.getId() == R.id.radStam) {

            score2 = questions.getQ2a();

        } else if (radio2.getId() == R.id.radOld) {

            score2 = questions.getQ2d();

        } else if (radio2.getId() == R.id.radWemb) {

            score2 = questions.getQ2b();

        }


        if (radio3.getId() == R.id.radKhune) {

            score3 = questions.getQ3a();

        } else if (radio3.getId() == R.id.radMatho) {

            score3 = questions.getQ3b();

        } else if (radio3.getId() == R.id.radioLeb) {

            score3 =  questions.getQ3c();

        } else if (radio3.getId() == R.id.radTshab) {

            score3 =  questions.getQ3d();

        }


        if (radio4.getId() == R.id.radRash) {

            score4 = 1;

        } else if (radio4.getId() == R.id.radSane) {

            score4 = 0;

        } else if (radio4.getId() == R.id.radAg) {

            score4 = 0;

        } else if (radio4.getId() == R.id.radRoney) {

            score4 = 0;

        }


        if (radio6.getId() == R.id.radAB) {

            score5 = 0;

        } else if (radio5.getId() == R.id.radRaba) {

            score5 = 1;

        } else if (radio5.getId() == R.id.radDe) {

            score5 = 0;

        } else if (radio5.getId() == R.id.radAm) {

            score5 = 0;

        }

        if (radio6.getId() == R.id.Jens) {

            score6 = 1;

        } else if (radio6.getId() == R.id.Casilas) {

            score6 = 0;

        } else if (radio6.getId() == R.id.Edin) {

            score6= 0;

        } else if (radio6.getId() == R.id.Les) {

            score6 = 0;

        }


        if (radio7.getId() == R.id.Ger) {

            score7 = 1;

        } else if (radio7.getId() == R.id.Drogba) {

            score7 = 1;

        } else if (radio7.getId() == R.id.Ronaldo) {

            score7= 0;

        } else if (radio7.getId() == R.id.Viera) {

            score7 = 0;

        }


        if (radio8.getId() == R.id.Vodacom) {

            score8 = 1;

        } else if (radio8.getId() == R.id.Holl) {

            score8= 0;

        } else if (radio8.getId() == R.id.Black) {

            score8= 0;

        } else if (radio8.getId() == R.id.Toyota) {

            score8 = 0;

        }
        answer = score + score2 + score3 + score4 + score5 +score6 +score7 + score8;

        if(answer <= 4){

            message="failed";

        }
        else{
            message="passed";

        }


        //Toast.makeText(Sports.this, " your score is   " + answer + " out of  5 "   + message, Toast.LENGTH_LONG).show();
        Toast.makeText(Sports.this, " click finish to see your Results "   + message, Toast.LENGTH_LONG).show();

         intentanswer =String.valueOf(answer);
        intentOutcome=String.valueOf(message);
    }

    public void finish(View view) {


//        Intent intent=new Intent(Sports.this,Results.class);
//        startActivity(intent);
        intent = new Intent(Sports.this,Results.class);
        intent.putExtra(ANSWERl,intentanswer);
        intent.putExtra(OUTCOME,intentOutcome);
        startActivity(intent);

    }
}