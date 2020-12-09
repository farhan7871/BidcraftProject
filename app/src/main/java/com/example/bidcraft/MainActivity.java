package com.example.bidcraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivclay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ivclay = findViewById(R.id.ivclay);

        ivclay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent gotanahliat = new Intent(MainActivity.this,CategoryClayActivity.class);
            startActivity(gotanahliat);
            }
        });
    }

}