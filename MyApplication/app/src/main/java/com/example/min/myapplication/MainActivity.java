package com.example.min.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.min.myapplication.R.id.editName;

public class MainActivity extends AppCompatActivity {

    private Button btnEnroll;
    private EditText editName,editAge;
    private Intent sIntent;
    private static final int RequestCode = 1001;

    private void initVIew(){
        btnEnroll = (Button) findViewById(R.id.btn_enroll);
        editName = (EditText)findViewById(R.id.editName);
        editAge = (EditText)findViewById(R.id.editAge);

        btnEnroll.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sIntent = new Intent(MainActivity.this, SecondActivity1.class);
                sIntent.putExtra("name", editName.getText().toString());
                sIntent.putExtra("age", editAge.getText().toString())
                startActivityForResult(sIntent, 1001);
            }

        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode){
            case 1001:
                if(resultCode==RESULT_OK){
                    Toast.makeText(MainActivity.this,data.getStringExtra("send"),Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
