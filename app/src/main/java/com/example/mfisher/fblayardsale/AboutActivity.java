package com.example.mfisher.fblayardsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import static com.example.mfisher.fblayardsale.R.id.buybutton;
import static com.example.mfisher.fblayardsale.R.id.donatebutton;

public class AboutActivity extends AppCompatActivity {

    Button buybutton, donatebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        buybutton=(Button) findViewById(R.id.buybutton);
        donatebutton=(Button) findViewById(R.id.donatebutton);

        buybutton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method sub

                //OPEN BUYACTIVITY
                startActivity(new Intent(getApplication(),BuyActivity.class));
                Toast.makeText(getApplicationContext(), "Your purchase is much appreciated!", Toast.LENGTH_LONG).show();
            }
        });

        donatebutton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method sub
                startActivity(new Intent(getApplication(),DonateActivity.class));
                Toast.makeText(getApplicationContext(), "Your donation is much appreciated!", Toast.LENGTH_LONG).show();
            }
        });
    //GITTEST
    }
}
