package com.arnold.simplify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.header_title);

        String s = Primitives.AutomorphicRange(1,10000);

        textView.setText(s);

        Custom.toast(MainActivity.this,"Hello",R.drawable.done,R.color.purple_200);

    }
}