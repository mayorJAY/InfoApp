package com.example.josycom.myalc4challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            //Opens the About Activity
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AboutALC.class);
                startActivity(myIntent);
                finish();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            //Opens the Portfolio Activity
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MyPortfolio.class);
                startActivity(myIntent);
                finish();
            }
        });
    }
}
