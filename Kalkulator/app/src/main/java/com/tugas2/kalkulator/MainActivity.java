package com.tugas2.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void tambah(View view) {
        Intent intent = new Intent(MainActivity.this, Tambah.class);
        startActivity(intent);
    }

    public void kurang(View view) {
        Intent intent = new Intent(MainActivity.this, Kurang.class);
        startActivity(intent);
    }

    public void kali(View view) {
        Intent intent = new Intent(MainActivity.this, Kali.class);
        startActivity(intent);
    }

    public void bagi(View view) {
        Intent intent = new Intent(MainActivity.this, Bagi.class);
        startActivity(intent);
    }


    public void proseskurang(View view) {
    }
}
