package com.example.myanime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AnimeGridAdapter extends RecyclerView.Adapter<AnimeGridAdapter.ViewHolder> {
    ArrayList<Anime> listAnime = new ArrayList<>();

    public AnimeGridAdapter(ArrayList<Anime> listAnime) {
        this.listAnime = listAnime;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(listAnime.get(position));
    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivAnime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAnime = itemView.findViewById(R.id.iv_anime);
        }

        void bind(Anime data) {
            Picasso.get()
                    .load(data.getImage())
                    .placeholder(R.drawable.ic_image_black_24dp)
                    .error(R.drawable.ic_image_black_24dp)
                    .into(ivAnime);
        }
    }
}
