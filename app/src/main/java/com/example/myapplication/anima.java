package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class anima extends AppCompatActivity {
    ImageView imageView11;
    ImageView imageView9;
    Animation frombottom, fromtop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        imageView11.setAnimation((frombottom));
        imageView9.setAnimation(fromtop);
    }

    public void loginfirst(View view) {
        Intent intent = new Intent(this,admin.class);
        startActivity(intent);
    }
}