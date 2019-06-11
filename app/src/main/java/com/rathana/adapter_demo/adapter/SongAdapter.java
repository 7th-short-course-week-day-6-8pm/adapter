package com.rathana.adapter_demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rathana.adapter_demo.R;
import com.rathana.adapter_demo.model.Song;

import java.util.List;

public class SongAdapter extends BaseAdapter
implements View.OnClickListener {


    List<Song> songs;
    Context context;
    int position;
    public SongAdapter(Context context, List<Song> songs) {
        this.context=context;
        this.songs = songs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=null;
        this.position=position;
        if(convertView!=null)
            view=convertView;
        else
            view= LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.song_item_layout,parent,false);

        //pass data to layout
        TextView songTitle=view.findViewById(R.id.songTitle);
        TextView singer=view.findViewById(R.id.singer);
        ImageView btnFavorite=view.findViewById(R.id.btnFavorite);
        final Song song = songs.get(position);
        songTitle.setText(song.getTitle());
        singer.setText(song.getSinger());

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "I favorite "+ song.getTitle(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return songs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnFavorite){
            Song song= songs.get(position);
            Toast.makeText(context, "I favorite "+ song.getTitle(), Toast.LENGTH_SHORT).show();
        }
    }
}
