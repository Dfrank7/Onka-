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

public class PhraseFrag extends Fragment {
    List<Word> phrase = new ArrayList<>();
    RecyclerView recyclerView;
    MediaPlayer mp;
    Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.phrase, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_phrase);
        adapter = new Adapter(getContext(), phrase,R.color.phrase);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        phrase.add(new Word("Nibo lo lon","Where are you going?",R.drawable.play,R.raw.nibi));
        phrase.add(new Word("Kini Oruko re","What is your name?",R.drawable.play,R.raw.kini));
        phrase.add(new Word("Oruko mi ni..","My name is..",R.drawable.play,R.raw.oruko));
        phrase.add(new Word("Omodun melo ni e","How old are you",R.drawable.play,R.raw.age));
        phrase.add(new Word("wa si bi yi","Come here",R.drawable.play,R.raw.wasibi));
        phrase.add(new Word("Malo","Go",R.drawable.play,R.raw.malo));
        phrase.add(new Word("Bawo ni","How are you",R.drawable.play,R.raw.bai));
        phrase.add(new Word("Mo nife re","I love you",R.drawable.play,R.raw.monife));
    }
}
