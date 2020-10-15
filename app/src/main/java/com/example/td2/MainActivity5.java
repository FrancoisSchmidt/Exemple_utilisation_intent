package com.example.td2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void log(View v) {
        setResult(1);
        finish();
    }

    public void log10(View v) {
        setResult(2);
        finish();
    }

    public void exp(View v) {
        setResult(3);
        finish();
    }
}