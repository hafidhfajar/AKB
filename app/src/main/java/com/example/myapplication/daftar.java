package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class daftar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        final EditText nama = (EditText) findViewById(R.id.editText);

            ImageButton submit = (ImageButton) findViewById(R.id.imageButton3);

            submit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    String var_nama = nama.getText().toString();
                    Intent i = null;
                    i = new Intent(daftar.this, selamat.class);
                    Bundle b = new Bundle();
                    b.putString("parse_nama", var_nama);
                    i.putExtras(b);
                    startActivity(i);
                }

            });
}
    }
