package com.example.ninetaildemonfox.myviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by dell-pc on 2019/2/25.
 */

public class ViewPagerAdp extends FragmentPagerAdapter {
    private List<Fragment> fragments;

    public ViewPagerAdp(FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdp(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }


}
