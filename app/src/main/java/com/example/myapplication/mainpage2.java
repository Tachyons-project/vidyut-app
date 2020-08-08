package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mainpage2 extends AppCompatActivity {
    private WebView webview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage2);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        webview1 = (WebView) findViewById(R.id.status);
        webview1.setWebViewClient(new WebViewClient());
        webview1.loadUrl("http://vidyut-forecast.herokuapp.com");
    }



    public void yuyu(View view) {
        Intent intent = new Intent(this,rprtprb.class);
        startActivity(intent);
    }

    public void billo(View view) {
        Intent intent = new Intent(this,bill.class);
        startActivity(intent);
    }
}