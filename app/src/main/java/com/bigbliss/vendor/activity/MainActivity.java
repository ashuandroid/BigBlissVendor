package com.bigbliss.vendor.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bigbliss.R;
import com.bigbliss.vendor.adapter.ExpandableListAdapter;
import com.bigbliss.vendor.fragment.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    Context mContext = this;

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    BottomNavigationView bottomNavigationView;

    DrawerLayout drawer;
    NavigationView navigationView;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    int previousGroup = -1;


    ImageView drawerMenu,ivWallet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.container_home, new HomeFragment()).commit();

        bottomNavigationView = findViewById(R.id.bot_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        ivWallet = findViewById(R.id.wallet_home);
        ivWallet.setOnClickListener(this::btnWalletClick);


        drawerMenu =  findViewById(R.id.menu_drawer);
        drawerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });

        navigationDrawer();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:


                        break;

                    case R.id.nav_orders:

                        startActivity(new Intent(mContext, OrdersActivity.class));

                        break;

                    case R.id.nav_manage_store:


                        break;

                    case R.id.nav_bill:


                        break;

                    case R.id.nav_menu:


                        break;

                }

                return true;
            }
        });
    }

    @Override
    protected void onResume() {
        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        super.onResume();

    }

    public void btnWalletClick(View view) {
        startActivity(new Intent(mContext, WalletActivity.class));
    }


    public void navigationDrawer() {
        expListView = findViewById(R.id.expandableListView);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                switch (groupPosition) {
                    case 0:


                        drawer.closeDrawer(GravityCompat.START);

                        break;

                  /*  case 1:


                        drawer.closeDrawer(GravityCompat.START);

                        break;*/

                    case 2:


                       // startActivity(new Intent(mContext, WalletActivity.class));
                        drawer.closeDrawer(GravityCompat.START);

                        break;


                    /*case 3:


                        drawer.closeDrawer(GravityCompat.START);

                        break;*/

                    case 4:


                        drawer.closeDrawer(GravityCompat.START);

                        break;

                    case 5:


                        drawer.closeDrawer(GravityCompat.START);

                        break;

                    case 6:


                        drawer.closeDrawer(GravityCompat.START);

                        break;


                    case 7:


                        drawer.closeDrawer(GravityCompat.START);

                        break;
                    case 8:


                        drawer.closeDrawer(GravityCompat.START);

                        break;

                }

                return false;
            }
        });


        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                switch (childPosition) {

                    case 0:

                        drawer.closeDrawer(GravityCompat.START);

                        break;

                    case 1:


                        drawer.closeDrawer(GravityCompat.START);

                        break;

                    case 2:


                        drawer.closeDrawer(GravityCompat.START);

                        break;

                    case 3:

                        drawer.closeDrawer(GravityCompat.START);

                        break;

                }

                return false;
            }
        });


        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if ((previousGroup != -1) && (groupPosition != previousGroup)) {
                    expListView.collapseGroup(previousGroup);
                }
                previousGroup = groupPosition;
            }
        });
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });


        navigationView = findViewById(R.id.nav_view);
        drawer = findViewById(R.id.navigation_drawer);
        View headerView = navigationView.getHeaderView(0);

    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Profile");
        listDataHeader.add("My Store");
        listDataHeader.add("Membership");
        listDataHeader.add("Wallet");
        listDataHeader.add("Looking for Funds");
        listDataHeader.add("Visit Mandi");
        listDataHeader.add("Promotion");
        listDataHeader.add("Invite Customer");
        listDataHeader.add("QR Code");
        listDataHeader.add("Billing");



        // Adding child data

        List<String> my_Store = new ArrayList<String>();
        my_Store.add("View Store");
        my_Store.add("Add Category");
        my_Store.add("Import Product");

        List<String> wallet = new ArrayList<String>();
        wallet.add("Wallet Offer");
        wallet.add("Wallet History");

        listDataChild.put(listDataHeader.get(1), my_Store);
        listDataChild.put(listDataHeader.get(3), wallet);

    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}