package com.example.soundwaves.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.soundwaves.Artist;
import com.example.soundwaves.ArtistAdapterItemOnClickListener;
import com.example.soundwaves.PlaylistAdapterItemOnClickListener;
import com.example.soundwaves.R;

import java.util.ArrayList;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistViewHolder>{
    private ArrayList<Artist> artists;
    private ArtistAdapterItemOnClickListener itemOnClickListener;
    private Context context;
    public ArtistAdapter(ArrayList<Artist> artists, Context context, ArtistAdapterItemOnClickListener itemOnClickListener) {
        this.artists = artists;
        this.context = context;
        this.itemOnClickListener = itemOnClickListener;
    }

    @NonNull
    @Override
    public ArtistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_main_artists_recycler, parent, false);
        return new ArtistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistViewHolder holder, int position) {
        Artist item = artists.get(position);
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(view -> itemOnClickListener.onArtistItemClickListener(item));
        holder.render(item, context);
    }
    @Override
    public int getItemCount() {
        return artists == null ? 0 : artists.size();
    }

}
