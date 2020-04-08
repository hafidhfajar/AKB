/**
  NIM : 10117131
  Nama : Hafidh Fajar A
  Kelas : AKB-4 / IF-4
  Tugas : AKB Pemanasan 1

  Update =
    -6 april    :   -membuat layout tampilan awal
                    -membuat tampilah kode keluarga
                    -membuat tampilan input nama
                    -membuat tambilan berhasil

    -7 April    :   -membuat fungsi2 untuk button
                    -membuat fungsi untuk menyimpan data nama
                    -membuat fungsi untuk memanggil nama yang diinputkan ke layout berhasil

    -8 April    :   -Upload ke github
 */

package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.text.HtmlCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Baca TextView
        TextView txt = (TextView) findViewById(R.id.textView);
        // Buat objek dari kelas TypeFace dengan membaca aset TTF
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/nunito_bold.ttf");
        // aplikasikan TypeFace ke TextView
        txt.setTypeface(font);


    }

    public void pindahlogin(View view) {
        Intent i = new Intent(MainActivity.this, login.class); //MainActivity adalah aktivity awal ,praktikum1Activity activity yang akan di tuju
        startActivity(i);
    }
}
