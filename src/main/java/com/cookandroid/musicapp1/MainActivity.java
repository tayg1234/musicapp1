package com.cookandroid.musicapp1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(new Music("곡 제목 1", "가수 이름 1", "3:30"));
        musicList.add(new Music("곡 제목 2", "가수 이름 2", "4:15"));
        musicList.add(new Music("곡 제목 3", "가수 이름 3", "2:45"));

        MusicAdapter musicAdapter = new MusicAdapter(musicList);
        recyclerView.setAdapter(musicAdapter);
    }
}