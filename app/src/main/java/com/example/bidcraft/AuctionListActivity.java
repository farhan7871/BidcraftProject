package com.example.bidcraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AuctionListActivity extends AppCompatActivity {

    ImageView btnadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auction_list);

        btnadd = findViewById(R.id.btnadd);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goactionform = new Intent(AuctionListActivity.this,AddAuctionActivity.class);
                startActivity(goactionform);
            }
        });

    }
}