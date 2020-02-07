package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Contacts extends AppCompatActivity {

    public void goBackButton(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);
    }

    public void inventoryButton(View view){
        Intent intent = new Intent(getApplicationContext(), Inventory.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
    }
}
