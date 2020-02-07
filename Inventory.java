package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inventory extends AppCompatActivity {

    public void Page1(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
    }
}
