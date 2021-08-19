package com.example.myanime;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AnimeListAdapter extends RecyclerView.Adapter<AnimeListAdapter.ViewHolder> {
    ArrayList<Anime> listAnime = new ArrayList<>();


    public AnimeListAdapter(ArrayList<Anime> listAnime) {
        this.listAnime = listAnime;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
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
        CircleImageView ivAnime;
        TextView tvTitle, tvTags;
        Context context = itemView.getContext();

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAnime = itemView.findViewById(R.id.iv_anime);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvTags = itemView.findViewById(R.id.tv_tags);
        }

        void bind(final Anime data) {
            Picasso.get()
                    .load(data.getImage())
                    .placeholder(R.drawable.ic_image_black_24dp)
                    .error(R.drawable.ic_image_black_24dp)
                    .into(ivAnime);
            tvTitle.setText(data.getTitle());
            tvTags.setText(data.getTags());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "You Choose " + tvTitle.getText().toString(), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_ANIME, data);
                    context.startActivity(intent);
                }
            });
        }
    }
}
