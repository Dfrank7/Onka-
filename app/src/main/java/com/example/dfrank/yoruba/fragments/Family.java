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

public class Family extends Fragment {
    List<Word> family = new ArrayList<>();
    RecyclerView recyclerView;
    MediaPlayer mp;
    Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.family, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_family);
        adapter = new Adapter(getContext(), family,R.color.family);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        family.add(new Word("Baba","Father",R.drawable.play,R.raw.baba));
        family.add(new Word("Iya","Mother",R.drawable.play,R.raw.iya));
        family.add(new Word("Omo","Children",R.drawable.play,R.raw.omo));
        family.add(new Word("Omo kunrin","Son",R.drawable.play,R.raw.bo));
        family.add(new Word("Omo birin","Daughter",R.drawable.play,R.raw.gi));
        family.add(new Word("Egbon","Elder Sibling",R.drawable.play,R.raw.egbon));
        family.add(new Word("Iya Agba","Grandmother",R.drawable.play,R.raw.gra));
        family.add(new Word("Baba Agba","GrandFather",R.drawable.play,R.raw.grap));
        family.add(new Word("Aburo","Younger Sibling",R.drawable.play,R.raw.abur));
    }
}
