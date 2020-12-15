package com.catha.digimaster.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListDigimonAdapter extends RecyclerView.Adapter<ListDigimonAdapter.ListDigimonViewHolder> {

    @NonNull
    @Override
    public ListDigimonAdapter.ListDigimonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListDigimonAdapter.ListDigimonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    //Create manual
    public class ListDigimonViewHolder extends RecyclerView.ViewHolder{

        public ListDigimonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
