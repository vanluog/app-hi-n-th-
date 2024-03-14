package com.example.baikiemtragiuakiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
RadioButton rdManHinh2,rdManHinh3;
Button btnChuyenManHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdManHinh2 = findViewById(R.id.rdManHinh2);
        rdManHinh3 = findViewById(R.id.rdManHinh3);
        btnChuyenManHinh = findViewById(R.id.btnChuyenManHinh);
        btnChuyenManHinh.setOnClickListener(v -> {
            if (rdManHinh2.isChecked()){
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
            if (rdManHinh3.isChecked()){
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });


    }
}