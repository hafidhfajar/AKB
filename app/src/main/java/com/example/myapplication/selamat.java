package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class selamat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamat);

        TextView nama1 = (TextView) findViewById(R.id.textView10);
        TextView nama2 = (TextView) findViewById(R.id.textView12);
        TextView nama3 = (TextView) findViewById(R.id.textView14);

        Bundle b = getIntent().getExtras();

        String get_nama = b.getString("parse_nama");
        nama1.setText("Beres! Sekarang "+get_nama);
        nama2.setText("Udah bisa ngecek             penggunaan HP "+get_nama);
        nama3.setText("  tiap hari buat bantu "+get_nama);



    }
    public void keluar(View view) {
        ImageButton exit = (ImageButton) findViewById(R.id.imageButton4);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Exit();
            }
        });
    }
        public void Exit () {
            finish();

        }
    }
