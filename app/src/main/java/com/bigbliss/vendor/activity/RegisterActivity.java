package com.bigbliss.vendor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding mBinding;
    Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_register);


        mBinding.btnRegister.setOnClickListener(this::registerBtnClick);

    }


    public void registerBtnClick(View view) {
        startActivity(new Intent(mContext,BusinessTypeActivity.class));
    }
}