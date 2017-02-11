package com.example.min.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        intent=new Intent(MainActivity.this, SecondActivity.class);
        initView();
        //intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel"+"01040404878"));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void initView() {

    }


    //@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Toast.makeText(MainActivity.this, "확인", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onRestart() {
        Log.i("MainActivity","다시 시작했습니다.");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.i("MainActivity","시작했습니다.");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.i("MainActivity","종료했습니다.");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.i("MainActivity","정지했습니다.");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.i("MainActivity","일시 정지했습니다.");
        super.onPause();
    }
}