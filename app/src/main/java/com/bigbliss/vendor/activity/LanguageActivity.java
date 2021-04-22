package com.bigbliss.vendor.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityLanguageBinding;

public class LanguageActivity extends AppCompatActivity {

    ActivityLanguageBinding mBinding;
    Context mContext = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_language);


        mBinding.tvEnglish.setOnClickListener(this::englishSelect);
        mBinding.tvHindi.setOnClickListener(this::hindiSelect);
        mBinding.tvPunjabi.setOnClickListener(this::punjabiSelect);
        mBinding.tvUrdu.setOnClickListener(this::urduSelect);
        mBinding.tvTamil.setOnClickListener(this::tamilSelect);
        mBinding.tvMalyalam.setOnClickListener(this::malayalamSelect);
        mBinding.tvGujrati.setOnClickListener(this::gujratiSelect);
        mBinding.tvMarathi.setOnClickListener(this::marathiSelect);
        mBinding.tvTelgu.setOnClickListener(this::telguSelect);
        mBinding.tvBangali.setOnClickListener(this::bangaliSelect);
        mBinding.tvKannada.setOnClickListener(this::kannadaSelect);
        mBinding.tvOdisha.setOnClickListener(this::odishaSelect);


    }

    public void englishSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void hindiSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void punjabiSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void urduSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void tamilSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void malayalamSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void gujratiSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void marathiSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void telguSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void bangaliSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void kannadaSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }

    public void odishaSelect(View view) {
        startActivity(new Intent(mContext, LoginActivity.class));
    }
}