package com.example.msa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.NumbersAdapterViewHolder> {
    ArrayList<Num> mnums = new ArrayList<>();
    public NumbersAdapter(ArrayList<Num> nums){
        mnums =nums;
    }

    @NonNull
    @Override
    public NumbersAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.numbers_item,parent,false);
        NumbersAdapterViewHolder itemViewHolder = new NumbersAdapterViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumbersAdapterViewHolder holder, int position) {
        Num item = mnums.get(position);
        holder.mImage.setImageResource(item.getmImage());
        holder.mTxt1.setText(item.getmTxt1());
        holder.mTxt2.setText(item.getmTxt2());
    }

    @Override
    public int getItemCount() {
        return mnums.size();
    }

    public static class NumbersAdapterViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImage;
        public TextView mTxt1;
        public TextView mTxt2;
        public NumbersAdapterViewHolder(View view){
            super(view);
            mImage = view.findViewById(R.id.numImage);
            mTxt1 =  view.findViewById(R.id.txt1);
            mTxt2 =  view.findViewById(R.id.txt2);
        }

    }

}
