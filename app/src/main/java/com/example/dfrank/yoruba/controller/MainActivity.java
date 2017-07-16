package com.example.dfrank.yoruba.controller;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dfrank.yoruba.R;
import com.example.dfrank.yoruba.adapters.nAdapter;
import com.example.dfrank.yoruba.fragments.DaysFrag;
import com.example.dfrank.yoruba.fragments.Family;
import com.example.dfrank.yoruba.fragments.NumberFrag;
import com.example.dfrank.yoruba.fragments.PhraseFrag;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragments = new ArrayList<>();
    List<String> texts = new ArrayList<>();
    private void addData(Fragment fragment, String text) {
        fragments.add(fragment);
        texts.add(text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        ViewPager viewPager= (ViewPager) findViewById(R.id.viewPager);
        prepareData();
        nAdapter nAdapter = new nAdapter(getSupportFragmentManager(), fragments, texts);
        viewPager.setAdapter(nAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void prepareData(){
        addData(new NumberFrag(), "Numbers");
        addData(new Family(), "Family");
        addData(new DaysFrag(), "Days");
        addData(new PhraseFrag(), "Phrase");
    }
}
