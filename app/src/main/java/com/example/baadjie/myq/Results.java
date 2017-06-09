package com.example.baadjie.myq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;



public class Results extends AppCompatActivity {

    // int results=Sports.answer;
    private TextView tvResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        tvResults=(TextView) findViewById(R.id.Results);
        //tvResults.setText("ghghghghg  " +results);

        Intent intent=getIntent();
        String answer = intent.getStringExtra(Sports.ANSWERl);
        String mssge=intent.getStringExtra(Sports.OUTCOME);



        tvResults.setText("your score is  "  + answer +"  "  + "out of  8" + "  you have      " + mssge);




    }
    public void home(View view){


        Intent intent=new Intent(Results.this,MainActivity.class);
        startActivity(intent);

    }


}
