package com.bigbliss.vendor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityConditionBinding;

public class ConditionActivity extends AppCompatActivity {

    ActivityConditionBinding mBinding;
    Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_condition);


        mBinding.cardYes.setOnClickListener(this::yesClick);
        mBinding.cardNo.setOnClickListener(this::noClick);

    }

    public void yesClick(View view) {
        startActivity(new Intent(mContext,MainActivity.class));
    }

    public void noClick(View view) {
        startActivity(new Intent(mContext,MainActivity.class));
    }

}