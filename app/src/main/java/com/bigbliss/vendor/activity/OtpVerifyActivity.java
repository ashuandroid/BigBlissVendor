package com.bigbliss.vendor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityOtpVerifyBinding;

public class OtpVerifyActivity extends AppCompatActivity {

    ActivityOtpVerifyBinding mBinding;
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       mBinding = DataBindingUtil.setContentView(this, R.layout.activity_otp_verify);


        mBinding.btnVerifyOtp.setOnClickListener(this::loginBtnClick);
    }

    public void loginBtnClick(View view) {
        startActivity(new Intent(mContext,RegisterActivity.class));
    }


}