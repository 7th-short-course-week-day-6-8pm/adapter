package com.rathana.adapter_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rathana.adapter_demo.adapter.SongAdapter;
import com.rathana.adapter_demo.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongActivity extends AppCompatActivity {

    ListView listView;
    SongAdapter songAdapter;
    List<Song> songs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        songs.add(new Song("song 1","singer 1"));
        songs.add(new Song("song 2","singer 1"));
        songs.add(new Song("song 3","singer 1"));
        songs.add(new Song("song 4","singer 1"));
        songs.add(new Song("song 5","singer 1"));
        songs.add(new Song("song 6","singer 1"));
        songs.add(new Song("song 7","singer 1"));
        songs.add(new Song("song 8","singer 1"));
        songs.add(new Song("song 9","singer 1"));
        songs.add(new Song("song 10","singer 1"));
        songs.add(new Song("song 11","singer 1"));
        songs.add(new Song("song 12","singer 1"));

        listView=findViewById(R.id.listView);
        songAdapter=new SongAdapter(this,songs);
        listView.setAdapter(songAdapter);
    }
}




