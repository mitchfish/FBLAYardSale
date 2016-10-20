package com.example.mfisher.fblayardsale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buybutton,donatebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }

   /* Button buybutton = (Button) findViewById(R.id.buybutton);
    buybutton.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), BuyActivity.class);
            startActivityForResult(intent, 0);
        }
    });

    Button donatebutton = (Button) findViewById(R.id.donatebutton);
    donatebutton.setOnClickListener(new OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), DonateActivity.class);
            startActivityForResult(intent, 0);
        }
    }); */
}
