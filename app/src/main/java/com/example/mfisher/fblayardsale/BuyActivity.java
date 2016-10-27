package com.example.mfisher.fblayardsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
    }

    Button imageView2 = (Button) findViewById(R.id.imageView2);
    imageView2.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent searchIntent = new Intent(BuyActivity.this, MainActivity.class);
            startActivity(Intent);
        }
    });
}
