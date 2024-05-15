package com.cookandroid.musicapp1;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/** @noinspection ClassEscapesDefinedScope*/
public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

    private List<Music> musicList;

    public MusicAdapter(List<Music> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.textViewTitle.setText(music.getTitle());
        holder.textViewArtist.setText(music.getArtist());
        holder.textViewDuration.setText(music.getDuration());
        // 아이콘 이미지 설정
        holder.imageViewIcon.setImageResource(R.drawable.ic_music_note);
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    static class MusicViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewArtist, textViewDuration;
        ImageView imageViewIcon;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewArtist = itemView.findViewById(R.id.textViewArtist);
            textViewDuration = itemView.findViewById(R.id.textViewDuration);
            imageViewIcon = itemView.findViewById(R.id.imageViewIcon);
        }
    }
}
