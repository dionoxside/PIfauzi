package com.example.aizawa.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Menu_awal extends AppCompatActivity {
private Button TT, RA, Kesenian, AK, PA, MT;
    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_menu);
        TT = (Button) findViewById(R.id.TT);
        TT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu_awal.this, MenuTT.class);
                startActivity(i);
            }
        });
        RA = (Button) findViewById(R.id.RA);
        RA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu_awal.this, MenuRA.class);
                startActivity(i);
            }
        });
        Kesenian = (Button) findViewById(R.id.Kesenian);
        Kesenian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu_awal.this, MenuKesenian.class);
                startActivity(i);
            }
        });
        AK = (Button) findViewById(R.id.AK);
        AK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu_awal.this, MenuAK.class);
                startActivity(i);
            }
        });
        PA = (Button) findViewById(R.id.PA);
        PA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu_awal.this, MenuPA.class);
                startActivity(i);
            }
        });
        MT = (Button) findViewById(R.id.MT);
        MT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu_awal.this, MenuMT.class);
                startActivity(i);
            }
        });
    }
}
