package com.example.sharedpreferencessample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_sample;
    String text = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_sample = findViewById(R.id.et_sample);
        SharedPreferences sharedPreferences = getSharedPreferences(text, 0);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(text, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = et_sample.getText().toString();
        editor.putString("July", value);
        editor.commit();
    }
}
