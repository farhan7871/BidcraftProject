package com.example.bidcraft;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    LinearLayout ivclay2, ivfiber, ivmetal, ivstone, ivwood, ivplastic;

    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ivclay2 = findViewById(R.id.ivclay2);
        ivfiber = findViewById(R.id.ivfiber);
        ivmetal = findViewById(R.id.ivmetal);
        ivstone = findViewById(R.id.ivstone);
        ivwood = findViewById(R.id.ivwood);
        ivplastic = findViewById(R.id.ivplastic);

        image1 = findViewById(R.id.image1);

        ivclay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoclay = new Intent(HomeActivity.this,CategoryClayActivity.class);
                startActivity(gotoclay);
            }
        });


        ivfiber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotofiber = new Intent(HomeActivity.this,CategoryFiberActivity.class);
                startActivity(gotofiber);
            }
        });

        ivmetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotometal = new Intent(HomeActivity.this,CategoryMetalActivity.class);
                startActivity(gotometal);
            }
        });

        ivstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotostone = new Intent(HomeActivity.this,CategoryStoneActivity.class);
                startActivity(gotostone);
            }
        });

        ivwood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotowood = new Intent(HomeActivity.this,CategoryWoodActivity.class);
                startActivity(gotowood);
            }
        });

        ivplastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoplastic = new Intent(HomeActivity.this,CategoryPlasticActivity.class);
                startActivity(gotoplastic);
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotolelang1 = new Intent(HomeActivity.this,AuctionActivity.class);
                startActivity(gotolelang1);
            }
        });
    }

}