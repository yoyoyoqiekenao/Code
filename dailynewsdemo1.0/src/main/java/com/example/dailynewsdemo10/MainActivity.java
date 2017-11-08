package com.example.dailynewsdemo10;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.dailynewsdemo10.Adapters.MyPagerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private int it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout=findViewById(R.id.myTabLayout);
        mViewPager=findViewById(R.id.myViewPager);
        initTab();
    }

    private void initTab() {
        ArrayList<Fragment> fragmentList=new ArrayList<>();
        fragmentList.add(new Fragment01());
        fragmentList.add(new Fragment02());
        fragmentList.add(new Fragment03());
        MyPagerAdapter pagerAdapter=new MyPagerAdapter(getSupportFragmentManager(),fragmentList,MainActivity.this);
        mViewPager.setAdapter(pagerAdapter);
        //tablayout
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        //连接ViewPager
        mTabLayout.setupWithViewPager(mViewPager);
        //添加tabitem
        mTabLayout.getTabAt(0).setText("第一页");
        mTabLayout.getTabAt(1).setText("第二页");
        mTabLayout.getTabAt(2).setText("第三页");
     }
}
