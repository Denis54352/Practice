package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void onClick(View view) {
        Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
        startActivity(intent);
    }
}