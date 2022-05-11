package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static  final String EXTRA_NAME = "com.example.multiscreenapp.extra.NAME"; // <- this is keyy //visit this for more info about intent https://developers.google.com/android/reference/com/google/android/gms/actions/NoteIntents

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
     public void openActivity(View v){
         Toast.makeText(this, "Opening Second Activity", Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(this,MainActivity2.class); //java maa object banako jastai ho same
         name = findViewById(R.id.name);
         String nameText = name.getText().toString();
         intent.putExtra(EXTRA_NAME , nameText); // (key , value) : putExtra() adds extended data to the intent


         startActivity(intent);

     }
}