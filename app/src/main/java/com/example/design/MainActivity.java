package com.example.design;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.toolBar)
    Toolbar toolbar;

    @BindView(R.id.floating)
    FloatingActionButton floatingActionButton;

    @BindView(R.id.coordinatorLayout)
    CoordinatorLayout coordinatorLayout;

    @BindView(R.id.appBarLayout)
    AppBarLayout appBarLayout;

    @BindView(R.id.msgHolder)
    CoordinatorLayout msg;

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setNavigationIcon(R.drawable.ic_dehaze_black_24dp);


        ViewPagerAdapter viewPagerAdapter
                 = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.setItems
                (new ArrayList<Fragment>(Arrays.asList(new Frag1(),new Frag2(),new Frag2())),new ArrayList<String>(Arrays.asList("title1","title2","title3")));
        tabLayout.setupWithViewPager(viewPager,true);
        viewPager.setAdapter(viewPagerAdapter);


    }


    @OnClick(R.id.floating)
    void fClick(){

        Snackbar.make(coordinatorLayout,"Haha!",Snackbar.LENGTH_SHORT).show();

    }


}
