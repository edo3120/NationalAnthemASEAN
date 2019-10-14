package com.example.nationalanthemasean;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListStateAdapter extends RecyclerView.Adapter<ListStateAdapter.ListViewHolder> {
    private ArrayList<State> listState;

    public ListStateAdapter(ArrayList<State> list){
        this.listState = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_asean, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        State state = listState.get(position);
        Glide.with(holder.itemView.getContext())
                .load(state.getFlag())
                .apply(new RequestOptions().override(600,384))
                .into(holder.imgFlag);
        holder.tvName.setText(state.getName());
        holder.tvSong.setText(state.getAnthem());
    }

    @Override
    public int getItemCount() {
        return listState.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFlag;
        TextView tvName, tvSong;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlag = itemView.findViewById(R.id.flag_of_state);
            tvName = itemView.findViewById(R.id.tv_item_state);
            tvSong = itemView.findViewById(R.id.tv_item_anthem);
        }
    }
}
