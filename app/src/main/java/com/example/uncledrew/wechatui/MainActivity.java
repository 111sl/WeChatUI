package com.example.uncledrew.wechatui;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.uncledrew.wechatui.adapter.ViewPagerAdapter;
import com.example.uncledrew.wechatui.fragment.FindFragment;
import com.example.uncledrew.wechatui.fragment.FriendsFragment;
import com.example.uncledrew.wechatui.fragment.MineFragment;
import com.example.uncledrew.wechatui.fragment.MsgFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<Fragment> fragmentList;
    private ViewPagerAdapter adapter;
    private RadioGroup radioGroup;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        viewPager = findViewById(R.id.view_pager);
        radioGroup = findViewById(R.id.radio_group);
        title = findViewById(R.id.action_title);
        fragmentList = new ArrayList<>();
        fragmentList.add(new MsgFragment());
        fragmentList.add(new FriendsFragment());
        fragmentList.add(new FindFragment());
        fragmentList.add(new MineFragment());
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
                        title.setText("微信");
                        break;
                    case 1:
                        radioGroup.check(R.id.friend_tab);
                        title.setText("通讯录");
                        break;
                    case 2:
                        radioGroup.check(R.id.find_tab);
                        title.setText("发现");
                        break;
                    case 3:
                        radioGroup.check(R.id.mine_tab);
                        title.setText("我");
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
