package com.example.dfrank.yoruba.fragments;

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
 * Created by dfrank on 6/20/17.
 */

public class NumberFrag extends Fragment {
    RecyclerView recyclerView;
    List<Word> num = new ArrayList<>();
    Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.number, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_number);
        adapter = new Adapter(getContext(), num, R.color.number);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        num.add(new Word("Ookan","One",R.drawable.play,R.raw.one));
        num.add(new Word("Meji","Two",R.drawable.play, R.raw.two));
        num.add(new Word("Meta","Three",R.drawable.play,R.raw.three));
        num.add(new Word("Merin","Four",R.drawable.play,R.raw.fiur));
        num.add(new Word("Marun","Five",R.drawable.play,R.raw.five));
        num.add(new Word("Mefa","Six",R.drawable.play,R.raw.six));
        num.add(new Word("Meje","Seven",R.drawable.play,R.raw.seven));
        num.add(new Word("Mejo","Eight",R.drawable.play,R.raw.hate));
        num.add(new Word("Mesan","Nine",R.drawable.play,R.raw.nine));
        super.onActivityCreated(savedInstanceState);

    }
}
