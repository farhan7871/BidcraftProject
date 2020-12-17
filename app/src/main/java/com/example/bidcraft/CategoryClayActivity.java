package com.example.bidcraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryClayActivity extends AppCompatActivity {

    Button btn_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_clay);

        btn_back_home = findViewById(R.id.btn_back_home);

        btn_back_home.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent gotohome = new Intent(CategoryClayActivity.this,MainActivity.class);
            startActivity(gotohome);
        }
    });
    }
}