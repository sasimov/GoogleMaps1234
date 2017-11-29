package com.example.sezerasimov.googlemaps1234;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton btn_Europaplatz = (ImageButton) findViewById(R.id.btn_Europaplatz);
        ImageButton btn_Kuenzelsau = (ImageButton) findViewById(R.id.btn_Kuenzelsau);
        ImageButton btn_SchwaebischHall = (ImageButton) findViewById(R.id.btn_SchwaebischHall);
        ImageButton btn_Sontheim = (ImageButton) findViewById(R.id.btn_Sontheim);

        btn_Sontheim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }});

        btn_Europaplatz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }});

        btn_SchwaebischHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }});

        btn_Kuenzelsau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }});
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}




