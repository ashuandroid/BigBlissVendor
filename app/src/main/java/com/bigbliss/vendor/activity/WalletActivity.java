package com.bigbliss.vendor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityWalletBinding;

public class WalletActivity extends AppCompatActivity {

     ActivityWalletBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_wallet);
    }
}