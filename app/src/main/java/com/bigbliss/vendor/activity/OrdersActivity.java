package com.bigbliss.vendor.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.bigbliss.R;
import com.bigbliss.databinding.ActivityOrdersBinding;

public class OrdersActivity extends AppCompatActivity {

    ActivityOrdersBinding mBinding;
    Context mContext = this;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_orders);

        mBinding.backAllOder.setOnClickListener(this::btnBackClick);
        mBinding.menuFilter.setOnClickListener(this::btnFilter);


        mBinding.orderDetails.llOrderDetails.setOnClickListener(this::btnDetailClick);



    }

    public void btnDetailClick(View view) {
       startActivity(new Intent(mContext,OrderDetails.class));
    }


    public void btnBackClick(View view) {
        finish();
    }

    public void btnFilter(View view) {
        openMenuOption();
    }

    public void openMenuOption() {
        PopupMenu popup = new PopupMenu(mContext, mBinding.menuFilter);
        //Inflating the Popup using xml file
        popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());

        //registering popup with OnMenuItemClickListener
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(mContext, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        popup.show();//showing popup menu
    }
}
