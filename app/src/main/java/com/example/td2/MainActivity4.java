package com.example.td2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void racine(View v){
        setResult(1);
        finish();
    }

    public void carre(View v){
        setResult(2);
        finish();
    }

    public void cube(View v){
        setResult(3);
        finish();
    }

}