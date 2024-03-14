package com.example.baikiemtragiuakiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
CheckBox ckDocSach,ckDuLich,ckTheThao;
EditText txtMaNV,txtHoTen,txtNamSinh;
TextView txtXemKetQua;
Button btnThem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ckDocSach = findViewById(R.id.ckDocSach);
        ckDuLich = findViewById(R.id.ckDuLich);
        ckTheThao = findViewById(R.id.ckTheThao);
        btnThem = findViewById(R.id.btnThem);
        txtMaNV = findViewById(R.id.txtMaNV);
        txtHoTen = findViewById(R.id.txtHoTen);
        txtNamSinh = findViewById(R.id.txtNamSinh);
        txtXemKetQua = findViewById(R.id.txtThongTin);
        btnThem.setOnClickListener(v -> {
            String maNV = txtMaNV.getText().toString();
            String hoTen = txtHoTen.getText().toString();
            String namSinh = txtNamSinh.getText().toString();
            String soThich = "";
            String hienthi = "";
            hienthi += "Ma Nhan Vien: " + maNV + "\n";
            hienthi += "Ho Ten: " + hoTen + "\n";
            int namHienTai = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
            int tuoi = namHienTai - Integer.parseInt(namSinh);
            if (!ckDocSach.isChecked() && !ckDuLich.isChecked() && !ckTheThao.isChecked()) {
                Toast.makeText(this, "Vui lòng chọn ít nhất 1 sở thích", Toast.LENGTH_SHORT).show();
            }
            if (ckDocSach.isChecked()){
                soThich += ckDocSach.getText().toString();
            }
            if (ckDuLich.isChecked()){
                soThich += ckDuLich.getText().toString();
            }
            if (ckTheThao.isChecked()){
                soThich += ckTheThao.getText().toString();
            }
            hienthi += "So Thich: " + soThich + "\n";
            hienthi += "Tuoi: " + tuoi + "\n";
            txtXemKetQua.setText(hienthi.toString());
        });

    }
}
