package com.bigbliss.vendor.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


import com.bigbliss.R;

public class OrderDetails extends AppCompatActivity {

    ImageView back;
    Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);


    }
}