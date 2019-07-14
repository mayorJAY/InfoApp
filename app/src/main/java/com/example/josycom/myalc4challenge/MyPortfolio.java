package com.example.josycom.myalc4challenge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyPortfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_portfolio);

        //Make the Email clickable
        final TextView emailTextView = findViewById(R.id.textView11);
        emailTextView.setOnClickListener(new View.OnClickListener() {

            //Get the content of the TextView ad convert it to a String
            String email = emailTextView.getText().toString();

            @Override
            public void onClick(View v) {

                //When the email is clicked, send it to an in-built email App
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", email, null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject text here");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body text here");
                startActivity(Intent.createChooser(emailIntent, "Send Email..."));
            }
        });

        //Make the Phone Number clickable
        final TextView phoneTextView = findViewById(R.id.textView13);
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get the content of the TextView and convert the phone number into a required format
                String phoneNumber = String.format("tel: %s", phoneTextView.getText().toString());

                //When the phone number is clicked, send it to the Call dialer App
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse(phoneNumber));
                startActivity(phoneIntent);
            }
        });
    }
    //Go back to the home page/Main Activity
    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
        finish();
    }
}
