package com.example.android.utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgbtn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //doa & dzikir
        tv = findViewById(R.id.tv_satu);
        tv .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godoadandzikir = new Intent(MainActivity.this, DoaDzikir.class);
                startActivity(godoadandzikir);
                finish();
            }
        });

        //doa lengkap
        tv = findViewById(R.id.tv_dua);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent godoalengkap = new Intent(MainActivity.this, DoaLengkap.class);
                startActivity(godoalengkap);
                finish();
            }
        });
    }
}
