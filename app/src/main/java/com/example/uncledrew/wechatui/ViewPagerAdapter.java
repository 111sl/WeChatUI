package com.example.uncledrew.wechatui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mViewList;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> mViewList) {
        super(fm);
        this.mViewList = mViewList;
    }

    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public Fragment getItem(int i) {
        return mViewList.get(i);
    }

/*
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }*/
}
