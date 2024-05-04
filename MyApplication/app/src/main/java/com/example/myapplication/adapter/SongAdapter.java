package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.Song;
import com.example.myapplication.SongList;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder>{
    private ArrayList<Song> songList;
    public SongAdapter(ArrayList<Song> songList) {
        this.songList = songList;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_playlist, parent, false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Song item = songList.get(position);
        holder.render(item);
    }
    @Override
    public int getItemCount() {
        return songList == null ? 0 : songList.size();
    }

}