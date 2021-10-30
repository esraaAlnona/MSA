package com.example.msa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView mTxt1;
    private TextView mTxt2;
    private TextView mTxt3;
    private TextView mTxt4;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        mTxt1 = (TextView) findViewById(R.id.textView1);
        mTxt2 = (TextView) findViewById(R.id.textView2);
        mTxt3 = (TextView) findViewById(R.id.textView3);
        mTxt4 = (TextView) findViewById(R.id.textView4);

        mTxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Numbers.class);
                startActivity(intent);
                finish();
            }
        });

        mTxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FamilyMembers.class);
                startActivity(intent);
                finish();
            }
        });

        mTxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Colors.class);
                startActivity(intent);
                finish();
            }
        });

        mTxt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Phrases.class);
                startActivity(intent);
                finish();
            }
        });

    }
}