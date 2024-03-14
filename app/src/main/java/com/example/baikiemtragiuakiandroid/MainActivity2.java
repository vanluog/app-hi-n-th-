package com.example.baikiemtragiuakiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
EditText soa,sob;
TextView txtKetQua;
Button btnTong,btnThuong,btnGiai,btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        soa = findViewById(R.id.txtSoA);
        sob = findViewById(R.id.txtSoB);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnTong = findViewById(R.id.btnTong);
        btnThuong = findViewById(R.id.btnThuong);
        btnGiai = findViewById(R.id.btnGiai);
        btnThoat = findViewById(R.id.btnThoat);
        btnTong.setOnClickListener(v -> {
            int a = Integer.parseInt(soa.getText().toString());
            int b = Integer.parseInt(sob.getText().toString());
            int tong = a+b;
            txtKetQua.setText("Tổng là: "+tong);
        });
        btnThuong.setOnClickListener(v -> {
            float a = Integer.parseInt(soa.getText().toString());
            float b = Integer.parseInt(sob.getText().toString());
            if (b==0){
                txtKetQua.setText("Không thể chia cho 0");
            }else {
                float thuong = a/b;
                txtKetQua.setText("Thương là: "+thuong);
            }
        });
        btnGiai.setOnClickListener(v -> {
            int a = Integer.parseInt(soa.getText().toString());
            int b = Integer.parseInt(sob.getText().toString());
            // giải phương trình ax+b=0
            if (a==0){
                if (b==0){
                    txtKetQua.setText("Phương trình vô số nghiệm");
                }else {
                    txtKetQua.setText("Phương trình vô nghiệm");
                }
            }else {
                int x = -b/a;
                txtKetQua.setText("Nghiệm của phương trình là: "+x);
            }
        });
        btnThoat.setOnClickListener(v -> {
            finish();
        });

    }
}