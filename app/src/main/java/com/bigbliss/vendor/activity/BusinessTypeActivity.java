package com.bigbliss.vendor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityBusinessTypeBinding;

public class BusinessTypeActivity extends AppCompatActivity {

    ActivityBusinessTypeBinding mBinding;
    Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_business_type);


        mBinding.tvSoleProprietor.setOnClickListener(this::tvSoleClick);
        mBinding.tvPartnership.setOnClickListener(this::tvPartnerClick);
        mBinding.tvPrivateLimited.setOnClickListener(this::tvPrivateClick);
        mBinding.tvLimitedCompany.setOnClickListener(this::tvLimitedClick);
        mBinding.tvNonProfit.setOnClickListener(this::tvNonProfitClick);

    }

    public void tvSoleClick(View view) {
        startActivity(new Intent(mContext,StoreSetupActivity.class));
    }

    public void tvPartnerClick(View view) {
        startActivity(new Intent(mContext,StoreSetupActivity.class));
    }


    public void tvPrivateClick(View view) {
        startActivity(new Intent(mContext,StoreSetupActivity.class));
    }


    public void tvLimitedClick(View view) {
        startActivity(new Intent(mContext,StoreSetupActivity.class));
    }

    public void tvNonProfitClick(View view) {
        startActivity(new Intent(mContext,StoreSetupActivity.class));
    }

}