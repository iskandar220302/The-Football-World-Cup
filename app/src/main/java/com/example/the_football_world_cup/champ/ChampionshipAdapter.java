package com.example.the_football_world_cup.champ;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_football_world_cup.R;

import java.util.List;

public class ChampionshipAdapter extends RecyclerView.Adapter<ChampionshipAdapter.ChampionshipViewHolder> {

    private final List<Championship> championshipList;

    public ChampionshipAdapter(List<Championship> championshipList) {
        this.championshipList = championshipList;
    }

    @NonNull
    @Override
    public ChampionshipViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.championship_item, parent, false);
        return new ChampionshipViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ChampionshipViewHolder holder, int position) {
        Championship championship = championshipList.get(position);
        holder.tvYear.setText("Год: " + championship.getYear());
        holder.tvCountry.setText("Страна: " + championship.getCountry());
        holder.tvWinner.setText("Победитель: " + championship.getWinner());
    }

    @Override
    public int getItemCount() {
        return championshipList.size();
    }

    public static class ChampionshipViewHolder extends RecyclerView.ViewHolder {
        TextView tvYear, tvCountry, tvWinner;

        public ChampionshipViewHolder(@NonNull View itemView) {
            super(itemView);
            tvYear = itemView.findViewById(R.id.tvYear);
            tvCountry = itemView.findViewById(R.id.tvCountry);
            tvWinner = itemView.findViewById(R.id.tvWinner);
        }
    }
}
