package com.bigbliss.vendor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityStoreSetupBinding;

public class StoreSetupActivity extends AppCompatActivity {

    ActivityStoreSetupBinding mBinding;
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_store_setup);


        mBinding.btnStoreSetup.setOnClickListener(this::setupBtnClick);

    }

    public void setupBtnClick(View view) {
        startActivity(new Intent(mContext,StoreCategoryActivity.class));
    }
}