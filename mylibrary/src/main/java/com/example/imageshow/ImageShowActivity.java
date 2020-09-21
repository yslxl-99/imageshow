package com.example.imageshow;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class ImageShowActivity extends AppCompatActivity {

    private ViewPager vp;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_show);
        initView();
    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        if (getIntent() != null) {
            list = getIntent().getStringArrayListExtra("list");
        } else {
            list = new ArrayList<>();
        }
        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(myViewPagerAdapter);
    }

    class MyViewPagerAdapter extends FragmentPagerAdapter {

        public MyViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return ImageFragment.newInstance(list.get(position));
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}