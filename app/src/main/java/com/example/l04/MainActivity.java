package com.example.l04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.txtname);
    }

    public void onlick(View view){
        Intent intent = new Intent(this, Activity2.class); // Activity 2 Run karanna kiyala intent ekk witharai
        String input =  name.getText().toString(); //input kiyana ekata gannw txtname eka string karagena
        // uda string ekath danawanm intentextras walin yanna wenw
        intent.putExtra("msg", input );

        startActivity(intent);
    }
}