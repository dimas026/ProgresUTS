package com.example.android.utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DoaDzikir extends AppCompatActivity {



    public void onBackPressed() {
        Intent goRegister = new Intent(DoaDzikir.this, MainActivity.class);
        startActivity(goRegister);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_dzikir);





    }
}
