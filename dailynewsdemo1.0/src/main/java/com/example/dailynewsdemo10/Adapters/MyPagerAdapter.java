package com.example.dailynewsdemo10.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by xujin on 2017/11/2.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private Context context;

    public MyPagerAdapter(FragmentManager fm, List<Fragment> list, Context context) {
        super(fm);
        this.list = list;
        this.context = context;
    }

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
