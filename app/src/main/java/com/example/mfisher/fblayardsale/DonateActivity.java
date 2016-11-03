package com.example.mfisher.fblayardsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class DonateActivity extends AppCompatActivity {

    Button donateitembutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        donateitembutton=(Button) findViewById(R.id.donateitembutton);

        donateitembutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method sub
                startActivity(new Intent(getApplication(),PostDonation.class));
                Toast.makeText(getApplicationContext(), "Item successfully donated", Toast.LENGTH_LONG).show();
            }
        });
    }
}
