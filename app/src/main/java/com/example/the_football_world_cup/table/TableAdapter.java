package com.example.the_football_world_cup.table;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_football_world_cup.R;

import java.util.List;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.TableViewHolder> {

    private List<TeamTable> tableList;

    public TableAdapter(List<TeamTable> tableList) {
        this.tableList = tableList;
    }

    // ViewHolder — внутренняя структура строки таблицы
    public static class TableViewHolder extends RecyclerView.ViewHolder {
        TextView tvPlace, tvTeamName, tvWins, tvLosses, tvPoints;

        public TableViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPlace = itemView.findViewById(R.id.tvPlace);
            tvTeamName = itemView.findViewById(R.id.tvTeamName);
            tvWins = itemView.findViewById(R.id.tvWins);
            tvLosses = itemView.findViewById(R.id.tvLosses);
            tvPoints = itemView.findViewById(R.id.tvPoints);
        }
    }

    @NonNull
    @Override
    public TableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.table_item, parent, false);
        return new TableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TableViewHolder holder, int position) {
        TeamTable team = tableList.get(position);
        holder.tvPlace.setText(String.valueOf(team.getPlace()));
        holder.tvTeamName.setText(team.getTeamName());
        holder.tvWins.setText(String.valueOf(team.getWins()));
        holder.tvLosses.setText(String.valueOf(team.getLosses()));
        holder.tvPoints.setText(String.valueOf(team.getPoints()));
    }

    @Override
    public int getItemCount() {
        return tableList.size();
    }
}
