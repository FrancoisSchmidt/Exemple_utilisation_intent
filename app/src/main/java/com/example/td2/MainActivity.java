package com.example.td2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText valA;
    public float valeurA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Create","Création...");
        this.valA = findViewById(R.id.valA);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Start", "Starting...");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Resume","Resuming...");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Pause","Pausing");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.coucou);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
        }
    }

    public void mainVersMain2(View v){
        try {
            this.valeurA = Float.parseFloat(String.valueOf(this.valA.getText()));
            Intent unVersDeux = new Intent(this, MainActivity2.class);
            startActivityForResult(unVersDeux, 2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Toast.makeText(this,"Entrez un nombre",Toast.LENGTH_SHORT).show();
        }
    }

    public void mainVersMain4(View v){
        try {
            this.valeurA = Float.parseFloat(String.valueOf(this.valA.getText()));
            Intent unVersQuatre = new Intent(this, MainActivity4.class);
            startActivityForResult(unVersQuatre,4);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Toast.makeText(this,"Entrez un nombre",Toast.LENGTH_SHORT).show();
        }
    }

    public void mainVersMain5(View v){
        try {
            this.valeurA = Float.parseFloat(String.valueOf(this.valA.getText()));
            Intent unVersCinq = new Intent(this, MainActivity5.class);
            startActivityForResult(unVersCinq,5);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Toast.makeText(this,"Entrez un nombre",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if (resultCode==1){
                this.valeurA += data.getFloatExtra("valB",0);
                this.valA.setText(String.valueOf(this.valeurA));
            } else if (resultCode == 2){
                this.valeurA -= data.getFloatExtra("valB",0);
                this.valA.setText(String.valueOf(this.valeurA));
            } else if (resultCode == 3){
                this.valeurA *= data.getFloatExtra("valB",0);
                this.valA.setText(String.valueOf(this.valeurA));
            } else if (resultCode == 4){
                this.valeurA /= data.getFloatExtra("valB",0);
                this.valA.setText(String.valueOf(this.valeurA));
            }
        } else if (requestCode == 4) {
            if (resultCode == 1) {
                this.valeurA = (float) Math.sqrt(this.valeurA);
                this.valA.setText(String.valueOf(this.valeurA));
            } else if (resultCode == 2) {
                this.valeurA = (float) Math.pow(this.valeurA, 2);
                this.valA.setText(String.valueOf(this.valeurA));
            } else if (resultCode == 3) {
                this.valeurA = (float) Math.pow(this.valeurA, 3);
                this.valA.setText(String.valueOf(this.valeurA));
            }
        } else if (requestCode == 5) {
            if (resultCode==1){
                this.valeurA = (float) Math.log(this.valeurA);
                this.valA.setText(String.valueOf(this.valeurA));
            } else if (resultCode == 2) {
                this.valeurA = (float) Math.log10(this.valeurA);
                this.valA.setText(String.valueOf(this.valeurA));
            } else if (resultCode == 3) {
                this.valeurA = (float) Math.exp(this.valeurA);
                this.valA.setText(String.valueOf(this.valeurA));
            }
        }
    }
}