package com.example.bidcraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivclay, ivclay2, ivfiber, ivmetal, ivstone, ivwood, ivplastic ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivclay2 = findViewById(R.id.ivclay2);
        ivfiber = findViewById(R.id.ivfiber);
        ivmetal = findViewById(R.id.ivmetal);
        ivstone = findViewById(R.id.ivstone);
        ivwood = findViewById(R.id.ivwood);
        ivplastic = findViewById(R.id.ivplastic);

        ivclay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent gotoclay = new Intent(MainActivity.this,CategoryClayActivity.class);
            startActivity(gotoclay);
            }
        });

        ivfiber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotofiber = new Intent(MainActivity.this,CategoryFiberActivity.class);
                startActivity(gotofiber);
            }
        });

        ivmetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotometal = new Intent(MainActivity.this,CategoryMetalActivity.class);
                startActivity(gotometal);
            }
        });

        ivstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotostone = new Intent(MainActivity.this,CategoryStoneActivity.class);
                startActivity(gotostone);
            }
        });

        ivwood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotowood = new Intent(MainActivity.this,CategoryWoodActivity.class);
                startActivity(gotowood);
            }
        });

        ivplastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoplastic = new Intent(MainActivity.this,CategoryPlasticActivity.class);
                startActivity(gotoplastic);
            }
        });
    }

}