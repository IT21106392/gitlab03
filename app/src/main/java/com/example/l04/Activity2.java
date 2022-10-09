package com.example.l04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Intent i ;  // activity 1 eken intent extra ewwa dena nisa
    TextView tt; // display karanna aapu eka

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tt = findViewById(R.id.ttt);

        i = getIntent(); // intent eke ena extra value tika ganna eka
        // aapu extra tika extract karaganna oona
        String text = i.getStringExtra("msg");

       tt.setText(text); // text eka display karanna meekata set karanawa


    }
}