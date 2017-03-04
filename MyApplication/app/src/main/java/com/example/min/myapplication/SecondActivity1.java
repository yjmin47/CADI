package com.example.min.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity1 extends AppCompatActivity {

    private Intent gIntent;
    private int data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
        gIntent = getIntent();


        data=gIntent.getIntExtra("main",-1);

        Toast.makeText(SecondActivity1.this,gIntent.getStringExtra("name")+"/"+gIntent.getStringExtra("age"), Toast.LENGTH_LONG).show();



    }
}
