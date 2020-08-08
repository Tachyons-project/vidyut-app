package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class rprtprb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rprtprb);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Spinner myspinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(rprtprb.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.compalint));
        myadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myadapter);
        Spinner myspinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> myadapter2 = new ArrayAdapter<String>(rprtprb.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.complaintcat));
        myadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner2.setAdapter(myadapter2);
        Spinner myspinner3 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<String> myadapter3 = new ArrayAdapter<String>(rprtprb.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.institution));
        myadapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner3.setAdapter(myadapter3);
    }
}