package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void rprtprb(View view) {
        Intent intent = new Intent(this,rprtprb.class);
        startActivity(intent);
    }

    public void prbst(View view) {
        Intent intent = new Intent(this,mainpage2.class);
        startActivity(intent);
    }

    public void billi(View view) {
        Intent intent = new Intent(this,bill.class);
        startActivity(intent);
    }
}