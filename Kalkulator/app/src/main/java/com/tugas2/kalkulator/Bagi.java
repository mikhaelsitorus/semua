package com.tugas2.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bagi extends AppCompatActivity {
    private Button btnhasil,btnkembali;
    private EditText etangka1,etangka2;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurang);
        btnhasil = findViewById(R.id.btn_hasil);
        btnkembali = findViewById(R.id.btn_kembali);
        tvhasil = findViewById(R.id.tv_hasil);
        etangka1 = findViewById(R.id.et_angka1);
        etangka2 = findViewById(R.id.et_angka2);

        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAngka1 = etangka1.getText().toString();
                String sAngka2 = etangka2.getText().toString();

                double angka1 = Double.parseDouble(sAngka1);
                double angka2 = Double.parseDouble(sAngka2);

                double hasil = angka1/angka2;

                String sHasil = String.valueOf(hasil);
                tvhasil.setText(sHasil);
            }
        });

        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bagi.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
