package com.example.dfrank.yoruba.adapters;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.dfrank.yoruba.R;
import com.example.dfrank.yoruba.Word;

import java.util.List;


/**
 * Created by dfrank on 6/20/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    MediaPlayer mp;
    List<Word> words;
    Context context;
    private int color;

    public Adapter(Context context, List<Word> words, int color) {
        this.words = words;
        this.context = context;
        this.color=color;
    }

    @Override
    public Adapter.viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.viewHolder holder, int position) {
        holder.yoruba.setText(words.get(position).getYoruba());
        holder.english.setText(words.get(position).getEnglish());
        Word word = words.get(position);
        if (word.hasImage()){
            holder.imageView.setImageResource(word.getImages());
            holder.imageView.setVisibility(View.VISIBLE);
        }else {
            holder.imageView.setVisibility(View.GONE);
        }
        int mcolor = ContextCompat.getColor(context, color);
        holder.textview.setBackgroundColor(mcolor);

    }

    @Override
    public int getItemCount() {
        return words.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        private TextView yoruba, english;
        LinearLayout textview;
        private ImageView imageView;
        public viewHolder(View itemView) {
            super(itemView);
            yoruba = (TextView) itemView.findViewById(R.id.yor);
            english = (TextView) itemView.findViewById(R.id.defaut);
            imageView = (ImageView) itemView.findViewById(R.id.icon);
            textview= (LinearLayout) itemView.findViewById(R.id.textcon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Word word = words.get(pos);
                    mp = MediaPlayer.create(context, word.getAudio());
                    mp.start();

                }
            });
        }
    }
}
