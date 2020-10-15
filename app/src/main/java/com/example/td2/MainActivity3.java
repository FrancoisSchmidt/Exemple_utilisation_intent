package com.example.td2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    public EditText valB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.valB = findViewById(R.id.valB);
    }

    public void calcul(View v){
        Intent troisVersDeux = new Intent();
        troisVersDeux.putExtra("valB",Float.parseFloat(String.valueOf(this.valB.getText())));
        setResult(0,troisVersDeux);
        finish();
    }

}