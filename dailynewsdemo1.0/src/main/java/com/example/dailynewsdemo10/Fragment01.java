package com.example.dailynewsdemo10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dailynewsdemo10.Adapters.Fragment01_Adapter01;

import java.util.ArrayList;

/**
 * Created by xujin on 2017/11/2.
 *
 */

public class Fragment01 extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment01, container, false);
        mTabLayout = view.findViewById(R.id.fragment01_myTab);
        mViewPager = view.findViewById(R.id.fragment01_myView);
        getData();
        initTab();
        return view;
    }

    private void initTab() {
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.addTab(mTabLayout.newTab());
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText("第一页");
        mTabLayout.getTabAt(1).setText("第二页");
    }

    private void getData() {
      ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
      fragmentArrayList.add(new Fragment01_fragment01());
      fragmentArrayList.add(new Fragment01_fragment02());
      mViewPager.setAdapter(new Fragment01_Adapter01(getChildFragmentManager(),fragmentArrayList));


    }
}
