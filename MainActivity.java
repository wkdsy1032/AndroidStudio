package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et_name;
    Button btn_submit;
    private EditText et_text;
    private String text;
    private Button btn_switch;
    ImageView iv_sample;
    ListView lv_sample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_name);
        btn_submit = findViewById(R.id.btn_submit);
        et_text = findViewById(R.id.et_text);
        btn_switch = findViewById(R.id.btn_switch);
        iv_sample = findViewById(R.id.iv_sample);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_name.setText("전화번호 뭐에요?");
            }
        });

        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = et_text.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class); // intent 의도
                intent.putExtra("text", text);
                startActivity(intent);
            }
        });

        iv_sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Issac Toast", Toast.LENGTH_SHORT).show();
            }
        });

        lv_sample = findViewById(R.id.lv_sample);
        List<String> list = new ArrayList<>();
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        lv_sample.setAdapter(arrayadapter);
        list.add("고추바사삭");
        list.add("뿌링클");
        list.add("고추마요 치킨");
        arrayadapter.notifyDataSetChanged();
    }
}