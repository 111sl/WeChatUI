package com.example.uncledrew.wechatui;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.uncledrew.wechatui.fragment.FirstFragment;
import com.example.uncledrew.wechatui.fragment.FourthFragment;
import com.example.uncledrew.wechatui.fragment.SecondFragment;
import com.example.uncledrew.wechatui.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> fragmentList;
    private ViewPagerAdapter adapter;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        radioGroup = findViewById(R.id.radio_group);
        fragmentList = new ArrayList<>();
        fragmentList.add(new FirstFragment());
        fragmentList.add(new SecondFragment());
        fragmentList.add(new ThirdFragment());
        fragmentList.add(new FourthFragment());
        adapter = new ViewPagerAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case 0:
                        radioGroup.check(R.id.message_tab);
                        break;
                    case 1:
                        radioGroup.check(R.id.friend_tab);
                        break;
                    case 2:
                        radioGroup.check(R.id.find_tab);
                        break;
                    case 3:
                        radioGroup.check(R.id.mine_tab);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.message_tab:
                        viewPager.setCurrentItem(0,false);
                        break;
                    case R.id.friend_tab:
                        viewPager.setCurrentItem(1,false);
                        break;
                    case R.id.find_tab:
                        viewPager.setCurrentItem(2,false);
                        break;
                    case R.id.mine_tab:
                        viewPager.setCurrentItem(3,false);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}