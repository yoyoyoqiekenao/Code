package com.example.dailynewsdemo10.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by xujin on 2017/11/3.
 */

public class Fragment01_Adapter01 extends FragmentPagerAdapter {
    private List<Fragment> list;

    public Fragment01_Adapter01(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    public Fragment01_Adapter01(FragmentManager fm) {
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

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }
}
