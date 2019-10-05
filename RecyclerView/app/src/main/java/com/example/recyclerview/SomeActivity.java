package com.example.recyclerview;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SomeActivity extends AppCompatActivity {

    private static final String TAG = "SomeActivity";

    private TextView textViewPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textViewPersonName = findViewById(R.id.image_name);
//
//        String personName = getIntent().getStringExtra("person_name");
//        textViewPersonName.setText(personName);
    }


}
