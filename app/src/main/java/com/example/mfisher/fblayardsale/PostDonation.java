package com.example.mfisher.fblayardsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PostDonation extends AppCompatActivity {

    Button donateagainbutton, shopbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_donation);

        donateagainbutton=(Button) findViewById(R.id.donateagainbutton);
        shopbutton=(Button) findViewById(R.id.shopbutton);

        shopbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method sub

                //OPEN BUYACTIVITY
                startActivity(new Intent(getApplication(),BuyActivity.class));
                Toast.makeText(getApplicationContext(), "Your purchase is much appreciated!", Toast.LENGTH_LONG).show();
            }
        });

        donateagainbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method sub
                startActivity(new Intent(getApplication(),DonateActivity.class));
                Toast.makeText(getApplicationContext(), "Your donation is much appreciated!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
