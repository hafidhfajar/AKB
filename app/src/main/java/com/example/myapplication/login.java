package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void pindahdaftar(View view) {
        Intent i = new Intent(login.this, daftar.class); //MainActivity adalah aktivity awal ,praktikum1Activity activity yang akan di tuju
        startActivity(i);
    }
}
