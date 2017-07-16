package com.example.dfrank.yoruba.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dfrank.yoruba.R;
import com.example.dfrank.yoruba.Word;
import com.example.dfrank.yoruba.adapters.Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dfrank on 6/21/17.
 */

public class DaysFrag extends Fragment {
    List<Word> days = new ArrayList<>();
    RecyclerView recyclerView;
    MediaPlayer mp;
    Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.days, container, false);
        recyclerView= (RecyclerView) view.findViewById(R.id.recycler_days);
        adapter = new Adapter(getContext(), days, R.color.color);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        days.add(new Word("Aiku","Sunday",R.raw.sun));
        days.add(new Word("Aje","Monday",R.raw.mon));
        days.add(new Word("Isegun","Tuesday",R.raw.tue));
        days.add(new Word("Ojoru","Wednesday",R.raw.wed));
        days.add(new Word("Ojobo","Thursday",R.raw.thyr));
        days.add(new Word("Eti","Friday",R.raw.fri));
        days.add(new Word("Abameta","Saturday",R.raw.sat));
    }
}
