package com.example.td2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void plus(View v){
        Intent deuxVersTrois = new Intent(this, MainActivity3.class);
        startActivityForResult(deuxVersTrois,1);
    }
    public void moins(View v){
        Intent deuxVersTrois = new Intent(this, MainActivity3.class);
        startActivityForResult(deuxVersTrois,2);
    }
    public void fois(View v){
        Intent deuxVersTrois = new Intent(this, MainActivity3.class);
        startActivityForResult(deuxVersTrois,3);
    }
    public void divise(View v){
        Intent deuxVersTrois = new Intent(this, MainActivity3.class);
        startActivityForResult(deuxVersTrois,4);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            //Intent intent = new Intent();
            //intent.putExtra("valB",data.getFloatExtra("valB",0));
            setResult(1, data);
        } else if (requestCode == 2){
            setResult(2, data);
        } else if (requestCode ==3){
            setResult(3, data);
        } else if (requestCode ==4){
            setResult(4, data);
        }
        finish();
    }
}